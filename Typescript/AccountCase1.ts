class AccountCase{
     accounNo:number;
     name:string;
     balance:number;

     constructor(accountNo:number, name:string, balance:number){
         this.accounNo=accountNo;
         this.name=name;
         this.balance=balance;
     }

     deposit=(amount:number):void=>{
        this.balance=this.balance+amount;
     }

     withdraw=(amount:number):void=>{
         this.balance=this.balance-amount;
     }

     getBalance=():number=>{
         return this.balance;
     }

     getName=():string=>{
         return this.name;
     }

     getAccountNumber=():number=>{
        return this.accounNo;
     }
}

var acc1=new AccountCase(101,"firstcutomer",1213);

console.log(acc1.getBalance())

acc1.deposit(500)
console.log(acc1.getBalance())