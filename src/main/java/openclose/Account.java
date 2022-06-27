package openclose;

import java.math.BigDecimal;

public abstract class Account {

    public void withdraw(BigDecimal amount) {
        System.out.println("Withdraw " + amount + " PLN from "+ this.toString() + " account");
    }


    public void deposit(BigDecimal amount) {
        System.out.println("Deposit " + amount + " PLN to "+ this.toString() + " account");
    }
}
