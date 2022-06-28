// function display(some){
//     console.log(some);
// }
// function calculate(num1,num2){
//     return num1+num2;
// }
// var result = calculate(10,20);
// display(result);

//----------------<>------------------//
// function display(some){
//     console.log(some);
// }
// function calculate(num1,num2){
//    var result = num1+num2;
//    display(result);
// }
// var result = calculate(10,20);


//----------------<>------------------//
function display(some){
    console.log(some);
}
function calculate(num1,num2,callback){
   var result = num1+num2;
   callback(result);
}
var result = calculate(10,20,display);

// Callback = passing a function as an argument to another function;


//-------------<>------------------//
const paymentStatus=false;
const marks = 80;
function enroll(callback){
    console.log('Enrolment is in progress');
    setTimeout(function(){
        if(paymentStatus){
            callback();
        }else{
            console.log('Enrolment is not completed');
        }
    },2000);
}

function progress(callback){
    console.log('Course is on progress');
    setTimeout(function(){
        if(marks>=80){
            callback();
        }else{
            console.log('Not eligible');
        }
    },3000);
}

function certificate(){
    console.log('Certificate is getting generated');
    setTimeout(function(){
       console.log('Certificate is generated');
    },1000);
}

// enroll();
// progress();
// certificate();


enroll(function(){
    progress(function(){
        certificate();
    });
});