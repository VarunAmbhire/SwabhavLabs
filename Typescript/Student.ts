export class Student{
    constructor(private name:string,private rollNo:number){
        
    }

    studentDetails=():string=>{
        return this.rollNo+" "+this.name;
    }
}

export class College{
    constructor(private stream:string, private student:Student){

    }

    nameStudent=():string=>{
        return this.stream+" "+this.student;
    }
}