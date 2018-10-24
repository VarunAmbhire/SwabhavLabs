var Function1 = /** @class */ (function () {
    function Function1() {
    }
    Function1.prototype.first = function () {
        console.log("Hello wewe");
    };
    return Function1;
}());
function paramFunc(id, name, isMale) {
    console.log(id + " " + name + " " + isMale);
}
function retFunc(id, name) {
    return id + " " + name;
}
var obj = new Function1();
obj.first();
paramFunc("sass", "vssd", "false");
console.log(retFunc(100, "asasasaas"));
var num = [5, 4, 3, "dsdsd", 3, false, 3, true];
for (var i = 0; i < num.length; i++) {
    console.log(num[i]);
}
