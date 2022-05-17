class Student{

    constructor(name,roll,age){
        this.name = name;
        this.age = age;
        this.roll = roll
    }
    display(){
        let output = 'Name = '+this.name+" Age = "+this.age+" Roll = "+this.roll;
        let dis = document.getElementById("result");
        dis.innerHTML = output;
    }
}

let Name;
let Age;
let Roll;

function myFunction(){
    console.log('submit button is clicked');
        Name = document.getElementById("inputName").value;
      //  console.log('Name = '+Name);
        Age = document.getElementById("inputAge").value;
       // console.log('Roll = '+Age);
        Roll = document.getElementById("inputRoll").value;
      //  console.log('Name = '+Roll);

}

function display(){
    console.log('display Button is clicked');
    let st1 = new Student(Name,Roll,Age);
    console.log('From Display = ');
    st1.display();

}

document.getElementById("submitButton").addEventListener("click", myFunction, true);
document.getElementById("displayButton").addEventListener("click",display,true);
