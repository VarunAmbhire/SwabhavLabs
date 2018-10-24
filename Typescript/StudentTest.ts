import {Student, College} from './Student'

let stud=new Student("var", 101)

console.log(stud.studentDetails())

let col=new College("IT", stud)

console.log(col.nameStudent())