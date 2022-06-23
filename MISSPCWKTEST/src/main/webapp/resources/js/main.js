const slides1 = document.querySelector('.slides1');
const slides2 = document.querySelector('.slides2');
const slideImg1 = document.querySelectorAll('.slides1 li');
const slideImg2 = document.querySelectorAll('.slides2 li');
let currentIdx1 = 0;
let currentIdx2 = 0;
const slideCount1 = slideImg1.length;
const slideCount2 = slideImg2.length;
const prev1 = document.querySelector('#prev1');
const prev2 = document.querySelector('#prev2');
const next1 = document.querySelector('#next1');
const next2 = document.querySelector('#next2');
const slideWidth1 = 300;
const slideWidth2 = 200;
const slideMargin1 = 100;
const slideMargin2 = 50;

slides1.getElementsByClassName.width = (slideWidth1 + slideMargin1) * slideCount1 + 'px';
slides2.getElementsByClassName.width = (slideWidth2 + slideMargin2) * slideCount2 + 'px';

function moveSlide1(num){
    slides1.style.left = -num * 400 + 'px';
    currentIdx1 = num;
    if(currentIdx1 == 0){
        prev1.style.display = 'none';
    }else{
        prev1.style.display = 'block';
    }
    if(currentIdx1 == slideCount1 - 3){
        next1.style.display = 'none';
    }else{
        next1.style.display = 'block';
    }
}
function moveSlide2(num){
    slides2.style.left = -num * 250 + 'px';
    currentIdx2 = num;
    if(currentIdx2 == 0){
        prev2.style.display = 'none';
    }else{
        prev2.style.display = 'block';
    }
    if(currentIdx2 == slideCount2 - 5){
        next2.style.display = 'none';
    }else{
        next2.style.display = 'block';
    }
}
function moveSlide(num, what){
    if(what == prev1 || next1){
        slides1.style.left = -num * 400 + 'px';
        currentIdx1 = num;
        if(currentIdx1 == 0){
            prev1.style.display = 'none';
        }else{
            prev1.style.display = 'block';
        }
        if(currentIdx1 == slideCount1 - 3){
            next1.style.display = 'none';
        }else{
            next1.style.display = 'block';
        }
    }else if(what == prev2 || next2){
        slides2.style.left = -num * 250 + 'px';
        currentIdx2 = num;
        if(currentIdx2 == 0){
            prev2.style.display = 'none';
        }else{
            prev2.style.display = 'block';
        }
        if(currentIdx2 == slideCount2 - 5){
            next2.style.display = 'none';
        }else{
            next2.style.display = 'block';
        }
    }
}
prev1.addEventListener('click', function(){
    if(currentIdx1 != 0){
        moveSlide1(currentIdx1 - 1);
        // moveSlide(currentIdx1 - 1, "prev1");
    }
});

next1.addEventListener('click', function(){
    if(currentIdx1 != slideCount1 - 3){
        moveSlide1(currentIdx1 + 1);
        // moveSlide(currentIdx1 + 1, "next1");
    }
})
prev2.addEventListener('click', function(){
    if(currentIdx2 != 0){
        moveSlide2(currentIdx2 - 1);
        // moveSlide(currentIdx2 - 1, "prev2");
    }
});

next2.addEventListener('click', function(){
    if(currentIdx2 != slideCount2 - 5){
        moveSlide2(currentIdx2 + 1);
        // moveSlide(currentIdx2 + 1, "next2");
    }
})