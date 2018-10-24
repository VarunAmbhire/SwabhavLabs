class Function1{
    first():void{
        console.log("Hello wewe")
    }
}
    function paramFunc(id, name, isMale){
        console.log(id+" "+name+" "+isMale)
    }

    function retFunc(id,name):string{
        return id+" "+name
    }

var obj=new Function1();
obj.first();
paramFunc("sass","vssd","false");
console.log(retFunc(100,"asasasaas"));

var num=[5,4,3,"dsdsd",3,false,3,true];
for(var i:number=0;i<num.length;i++){
    console.log(num[i])
}