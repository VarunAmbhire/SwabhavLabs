class AccountCase{
    constructor(private _accountNo:number, private _name:string, private _balance:number){
       
    }    
    get name(){
        return this._name;
    }

    set name(name){
        this._name=name;
    }

    get accountNo(){
        return this._accountNo;
    }

    get balance(){
        return this._balance;
    }

    deposit=(amount:number):void=>{
        this._balance=this._balance+amount;
    }

    withdraw=(amount:number):void=>{
        this._balance=this._balance-amount;
    }
}

var acc=new AccountCase(101,"jkl",500);

console.log(acc.balance)

acc.deposit(200)
console.log(acc.balance)

console.log(acc.name)

acc.name="john"
console.log(acc.name)

