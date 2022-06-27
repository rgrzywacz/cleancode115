package openclose;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {

    public void withdrawFromCurrentAccount(BigDecimal bigDecimal, CurrentAccount currentAccount) {
        System.out.println("Withdraw " + bigDecimal.toString() + " PLN from "+currentAccount.toString() + " account");
    }
    public void depositToCurrentAccount(BigDecimal bigDecimal, CurrentAccount currentAccount){
        System.out.println("Deposit "+bigDecimal.toString()+" PLN to "+currentAccount.toString() + " account");
    }

    public void withdrawFromSavingAccount(BigDecimal bigDecimal, SavingAccount savingAccount) {
        System.out.println("Withdraw " +bigDecimal.toString() + " PLN from "+savingAccount.toString() + " account");
    }

    public void depositToSavingAccount(BigDecimal bigDecimal, SavingAccount savingAccount) {
        System.out.println("Deposit "+bigDecimal.toString()+" PLN to "+savingAccount.toString() + " account");
    }
}
