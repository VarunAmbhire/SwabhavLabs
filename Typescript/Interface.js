var printMethod = function (studentList) {
    for (var _i = 0, studentList_1 = studentList; _i < studentList_1.length; _i++) {
        var student = studentList_1[_i];
        console.log(student);
    }
};
printMethod([{ firstName: "va", rollNo: 12, cgpa: 232 }, { firstName: "abc", rollNo: 122, cgpa: 22 }, { firstName: "va", rollNo: 12, cgpa: 82 }]);
