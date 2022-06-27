package openclose;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {

    public void withdraw(BigDecimal bigDecimal, Account account) {
       account.withdraw(bigDecimal);
    }

    public void deposit(BigDecimal bigDecimal, Account account){
        account.deposit(bigDecimal);
    }
}
