"use strict";
exports.__esModule = true;
var Student_1 = require("./Student");
var stud = new Student_1.Student("var", 101);
console.log(stud.studentDetails());
var col = new Student_1.College("IT", stud);
console.log(col.nameStudent());
