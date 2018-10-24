var AccountCase = /** @class */ (function () {
    function AccountCase(accountNo, name, balance) {
        var _this = this;
        this.deposit = function (amount) {
            _this._balance = _this._balance + amount;
        };
        this.withdraw = function (amount) {
            _this._balance = _this._balance - amount;
        };
        this._accounNo = accountNo;
        this._name = name;
        this._balance = balance;
    }
    Object.defineProperty(AccountCase.prototype, "accountNo", {
        get: function () {
            return this._accounNo;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(AccountCase.prototype, "balance", {
        get: function () {
            return this._balance;
        },
        set: function (balance) {
            this._balance = balance + this._balance;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(AccountCase.prototype, "name", {
        get: function () {
            return this._name;
        },
        set: function (name) {
            this._name = name;
        },
        enumerable: true,
        configurable: true
    });
    return AccountCase;
}());
var acc1 = new AccountCase(101, "firstcutomer", 1213);
console.log(acc1.balance);
acc1.balance = 500;
console.log(acc1.balance);
console.log(acc1.name);
acc1.name = "asas";
console.log(acc1.name);
