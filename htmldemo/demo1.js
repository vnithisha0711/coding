/*
class Employee{
    constructor(empid,ename,sal){
        this.empid=empid;
        this.ename=ename;
        this.sal=sal;
    }

    display=()=>{ //arrow function --- normal function display()
        console.log(` ${this.ename} : ${this.sal} `);
    }
}
let obj = new Employee(101,"Ramesh",3500);
obj.display();
*/


/*
function getTotal(custname,...price){
    console.log(` Customer Name : ${custname} `);
    let total=0;
    for(let p of price){
        total+=p;
    }
    console.log(` Total Amount : ${total} INR`);
    console.log(`============================`);
}
getTotal("Revi",20,45);
getTotal("Raj",50,85,45);
getTotal("Ram",35);
*/


let arr=[1,2,3,-1];

console.log(Math.min(...arr)); //...arr is used for spreading the array
console.log(arr);
console.log(...arr);
