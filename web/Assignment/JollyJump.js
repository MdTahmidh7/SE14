// console.log(100);

// const array = [];
// let length = array.length;
// console.log("The length is = ",length);
// for (let i = 0; i <5; i++) {
//     array[i] = i;
// }

// for (let i = 0; i < array.length; i++) {
//     console.log(array[i]);
// }
// console.log("ok");

console.log("This is a new array");

let a = [-11,2,3,-5];
let b = [];
let diff = [];
// for (let i = 0; i < a.length; i++) {
//     console.log("a",a[i]);  
// }

for (let i = 0; i < a.length; i++) {
      b[i] = Math.abs(a[i]);
}

for (let i = 0; i < a.length; i++) {
    console.log("b",b[i]);  
}
for (let i = 0; i < (b.length)-1; i++) {
    let temp =0; 
    temp=b[i]-b[i+1];
    temp = Math.abs(temp);
    console.log("Diff = ",temp);
}


