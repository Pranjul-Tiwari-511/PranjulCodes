// let,var and const

// var myAge=7;
// myAge=8
// console.log(myAge);
// {
//     let s1=56;
//     console.log(s1);
// }

// diff between (==)  && (===)
/*
== : uses to compares values of two variables
=== : uses to compares values as well as datatypes of two variables 
*/

/* let a=5;

let b='5';

console.log(a==b)// true


let a=33;

let b=33;

console.log(a==b)


*/




// console.log(s1);
// console.log(myAge="Pranjul");
// console.log(myAge);


// For loop
// let result='';

// for(let i=1;i<=10;i++){
//     result=result+i+" ";
// }

// console.log(result)


// for in loop
/*
let obj={
    name:"harry",
    marks:77,
    age:36,
    gender:"male"
}

for(let i in obj){
    console.log("details of " + i +" is  " + obj[i])
}

*/

// typeof() function uses and for of loop


/*
// let c=BigInt("23973623");

// console.log(typeof(c))

// for(let i of "harry"){
//     console.log(i);
// }
*/


// template literals 


/*

let boy1='pramod';

let boy2='nikhil';

let sent= `${boy1} is the friend of ${boy2}`;

console.log(sent)

*/


// escape sequence 

/*

let s1='prate\'ek';
let fruit="bana\"na"

console.log(s1)
console.log(fruit)


*/

// Arrays

let arr=["pranjul",25,67,false,24]

/*
let arr=["pranjul",25,67,false,24]
for(let i=0;i<arr.length;i++){
    console.log(arr[i])
}

console.log(arr.length)
arr[0]='nishchay'
arr[5]=88

for(let i=0;i<arr.length;i++){
    console.log(arr[i])
}

console.log(typeof(arr))
*/

// let c= arr.join(" and ")

// console.log(c,typeof(c))

//=>>>>>>>>>>vvvImp
 
let compare=(a,b)=>{
  return b-a;
}

let num=[551,25,24,98,1,6,5,88,22,17]

num.sort(compare)
console.log(num)