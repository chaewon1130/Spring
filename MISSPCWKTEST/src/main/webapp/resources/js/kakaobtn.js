$(function(){
	$('#kakaoapibtn').click(function(){
		
		alert("hello");
		
		$.ajax ({
			url : "miss/pay/kakaoPay.do",
			type : "post"
			
		});
	});
});
