import java.math.BigDecimal;

import dependencyinversion.BookService;
import interfacesegregation.BankPayment;
import interfacesegregation.Payment;
import openclose.BankingAppWithdrawalService;
import openclose.CurrentAccount;
import openclose.SavingAccount;
import singleresponsibility.TextManipulator;

public class Main {
    public static void main(String[] args) {
        //single responsibility
        TextManipulator textManipulator = new TextManipulator("Ala ma kota");
        textManipulator.printText();
        textManipulator.appendText(" test dodawania tekstu");
        textManipulator.printText();
        textManipulator.printOutEachWordOfText();
        textManipulator.printRangeOfCharacters(1,4);

        // open/close
        BankingAppWithdrawalService bankingAppWithdrawalService = new BankingAppWithdrawalService();
        CurrentAccount currentAccount = new CurrentAccount();
        bankingAppWithdrawalService.depositToCurrentAccount(BigDecimal.valueOf(100), currentAccount);
        bankingAppWithdrawalService.withdrawFromCurrentAccount(BigDecimal.valueOf(50), currentAccount);
        SavingAccount savingAccount = new SavingAccount();
        bankingAppWithdrawalService.depositToSavingAccount(BigDecimal.valueOf(500), savingAccount);
        bankingAppWithdrawalService.withdrawFromSavingAccount(BigDecimal.valueOf(100), savingAccount);

        // liskov

        //interface segregation
        Payment bankPayment = new BankPayment();

        //dependency inversion
        BookService bookService = new BookService();
        bookService.createBook("W pustyni i w puszczy ");
    }
}
