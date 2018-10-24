interface IStudent{
    firstName:string;
    rollNo:number;
    cgpa:number;
}

var printMethod = (studentList:IStudent[])=>{
    for(let student of studentList){
        console.log(student);
    }
    
}


printMethod([{firstName:"va",rollNo:12,cgpa:232},{firstName:"abc",rollNo:122,cgpa:22},{firstName:"vlllloa",rollNo:12,cgpa:82}]);


