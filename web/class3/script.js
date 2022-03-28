var step = 0;
function myFunction(){
    var number = parseInt(document.getElementById("inputNumber").value);
    console.log("Your Input Number is = ",number);
        for (let i = number; number > 1; i--) {
            if(number%2==0){
                number=number/2;
                step++;
                console.log("Step = ",step,"Number = ",number);
            }
            else{
            number=(number*3)+1;
            step++;
            console.log("Step = ",step,"Number = ",number);
            }
           
        }
step=0;
}


