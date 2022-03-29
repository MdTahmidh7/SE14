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
    diff[i] = temp;
}
diff.sort();

console.log("This is difference Array = ");
for (let i = 0; i < diff.length; i++) {
    console.log("d = ",diff[i]);  
}
console.log("Diff of diff");
console.log(" Array = ");
let dif2 = diff[0]-diff[1];

dif2 = Math.abs(dif2);
let result = true;
console.log("1st diff of diff = ", dif2);
for (let i = 0; i < (diff.length)-1; i++) {
   let dif1 = diff[i]-diff[i+1]
  if(dif1!=dif2){
    result = false;
    break;
  } 
}
if(result){
    console.log("Jolly");
}
else
{
    console.log("Not jolly");
}
