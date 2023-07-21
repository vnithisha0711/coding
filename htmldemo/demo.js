const student={
    "sid":101,
    "sname":"Suresh",
    "Div":"X"
}
//console.log(student.sname);

//let{sid:id,sname:name1,Div:div}=student; //object destructuring
let {sid,sname,Div}=student;
//console.log(name1)
console.log(`StudentName: ${sname}`)

let arr=[20,1,45,23]  
//let p=arr[0]
//let q=arr[]

let [p,q,r,s]=arr //array destructuring
console.log(r)

function sub(x,y=1){ //default parameter
    res=x-y;
    console.log(res)
}
sub(10,2);
sub(5);