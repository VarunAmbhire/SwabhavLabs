class AccountCase{
    private _accounNo:number;
    _name:string;
    _balance:number;

    constructor(accountNo:number, name:string, balance:number){
        this._accounNo=accountNo;
        this._name=name;
        this._balance=balance;
    }
    deposit=(amount:number):void=>{
       this._balance=this._balance+amount;
    }

    withdraw=(amount:number):void=>{
        this._balance=this._balance-amount;
    }

    get accountNo(){
        return this._accounNo;
    }

    get balance(){
        return this._balance;
    }

    set balance(balance){
        this._balance=balance+this._balance;
    }

    get name(){
        return this._name;
    }

    set name(name){
        this._name=name;
    }
       
}

var acc1=new AccountCase(101,"firstcutomer",1213);

console.log(acc1.balance)
acc1.balance=500;
console.log(acc1.balance)

console.log(acc1.name);
acc1.name="asas";
console.log(acc1.name);