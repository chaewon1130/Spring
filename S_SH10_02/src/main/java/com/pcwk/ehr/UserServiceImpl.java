package com.pcwk.ehr;

import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserServiceImpl implements UserService {

	final Logger LOG = LogManager.getLogger(this.getClass());
	// 상수 도입 : 30, 50
	// BASIC -> SILVER로 가는 최소 로그인수
	public static final int MIN_LOGCOUNT_FOR_SILVER = 50;
	
	// SILVER -> GOLD로 가는 추천수
	public static final int MIN_RECOMMEND_FOR_GOLD = 30;
	
	private UserDao userDao;
	
	public UserServiceImpl() {
		
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void upgradeLevels(UserVO inVO) throws SQLException {
		
		List<UserVO> list = userDao.getAll(inVO);
		// BASIC -> SILVER(50회 이상 로그인)
		// SILVER -> GOLD(30번 이상 추천)
		// GOLD는 대상이 아님
		
		// 코드에 중복된 부분은 없는가?
		// 코드가 무엇을 하는 것인지 이해하기 불편하지 않은가?
		// 코드가 있어야 할 자리에 있는가?
		// 앞으로 변경이 일어난다면 어떤 것이 있을 수 있고, 그 변환에 쉽게 대응할 수 있게 작성되어 있는가?
		for(UserVO user : list) {
			if(canUpgradeLevel(user) == true) {
				upgradeLevel(user);
			}
		}
	}
	
	/**
	 * 레벨 업그레이드 작업
	 * @param user
	 * @throws SQLException 
	 */
	private void upgradeLevel(UserVO user) throws SQLException {
		// 다음레벨로 up
		user.upgradeLevel();
		this.userDao.doUpdate(user);
	}
	
	
	/**
	 * User가 업그레이드 대상인지 확인
	 * @param user
	 * @return 대상(true) / 대상이 아니면(false)
	 */
	private boolean canUpgradeLevel(UserVO user) {
		Level currentLevel = user.getLevel();
		
		switch(currentLevel) {
		case BASIC:
			return (user.getLogin() >= MIN_LOGCOUNT_FOR_SILVER);
		case SILVER:
			return (user.getRecommend() >= MIN_RECOMMEND_FOR_GOLD);
		case GOLD:
			return false;
		default:
			throw new IllegalAccessError("Unknown Level : " + currentLevel);
		}
	}
	

	@Override
	public int add(UserVO inVO) throws SQLException {
		
		if(inVO.getLevel() == null) {
			inVO.setLevel(Level.BASIC);
		}
		return this.userDao.doInsert(inVO);
	}
}
