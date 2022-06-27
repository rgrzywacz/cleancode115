package liskov;

import java.math.BigDecimal;

import openclose.Account;

public class WithdrawableAccount extends Account{

    void withdraw(BigDecimal amount, Account account) {
        System.out.println("Withdraw " + amount + " PLN from "+ this.toString() + " account");
    }
}
