"use strict";
exports.__esModule = true;
var Student = /** @class */ (function () {
    function Student(name, rollNo) {
        var _this = this;
        this.name = name;
        this.rollNo = rollNo;
        this.studentDetails = function () {
            return _this.rollNo + " " + _this.name;
        };
    }
    return Student;
}());
exports.Student = Student;
var College = /** @class */ (function () {
    function College(stream, student) {
        var _this = this;
        this.stream = stream;
        this.student = student;
        this.nameStudent = function () {
            return _this.stream + " " + _this.student;
        };
    }
    return College;
}());
exports.College = College;
