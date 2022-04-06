console.log("Tahmid");
let person = {
    name : "Saju",
    roll : "ASH1925014M"
}
console.log('Name = '+person.name);
person.name = "Raju";
console.log('Name = '+person.name);

class car{
    constructor(model,color){
        this.model = model;
        this.color = color;
    }
}
let car1 = new car("GT MX");
console.log('Mode = ',car1.model);
console.log('Color = ',car1.color);


function Student(name,roll,email){
    this.name = name;
    this.roll = roll;
    this.email = email;
    this.info = function(){
        console.log('Student Name = '+student1.name);
        console.log('Student Roll = '+student1.roll);
        console.log('Student Email = '+student1.email); 
    }
}

let student1 = new Student("Kaju",102,"Kaju@gmail.com");
student1.info();


