class AccountCase {
    constructor(_accountNo, _name, _balance) {
        this._accountNo = _accountNo;
        this._name = _name;
        this._balance = _balance;
        this.deposit = (amount) => {
            this._balance = this._balance + amount;
        };
        this.withdraw = (amount) => {
            this._balance = this._balance - amount;
        };
    }
    get name() {
        return this._name;
    }
    set name(name) {
        this._name = name;
    }
    get accountNo() {
        return this._accountNo;
    }
    get balance() {
        return this._balance;
    }
}
var acc = new AccountCase(101, "jkl", 500);
console.log(acc.balance);
acc.deposit(200);
console.log(acc.balance);
console.log(acc.name);
acc.name = "john";
console.log(acc.name);
