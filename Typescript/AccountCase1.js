var AccountCase = /** @class */ (function () {
    function AccountCase(accountNo, name, balance) {
        var _this = this;
        this.deposit = function (amount) {
            _this.balance = _this.balance + amount;
        };
        this.withdraw = function (amount) {
            _this.balance = _this.balance - amount;
        };
        this.getBalance = function () {
            return _this.balance;
        };
        this.getName = function () {
            return _this.name;
        };
        this.getAccountNumber = function () {
            return _this.accounNo;
        };
        this.accounNo = accountNo;
        this.name = name;
        this.balance = balance;
    }
    return AccountCase;
}());
var acc1 = new AccountCase(101, "firstcutomer", 1213);
console.log(acc1.getBalance());
acc1.deposit(500);
console.log(acc1.getBalance());
