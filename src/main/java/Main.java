import java.math.BigDecimal;

import dependencyinversion.BookService;
import dependencyinversion.IsbnGenerator;
import interfacesegregation.BankPayment;
import interfacesegregation.Payment;
import openclose.Account;
import openclose.BankingAppWithdrawalService;
import openclose.CurrentAccount;
import singleresponsibility.TextManipulator;
import singleresponsibility.TextPrinter;

public class Main {
    public static void main(String[] args) {
        //single responsibility
        TextManipulator textManipulator = new TextManipulator("Ala ma kota");
        TextPrinter textPrinter = new TextPrinter(textManipulator);
        textPrinter.printText();
        textManipulator.appendText(" test dodawania tekstu");
        textPrinter.printText();
        textPrinter.printOutEachWordOfText();
        textPrinter.printRangeOfCharacters(1,4);

        //open/close
        BankingAppWithdrawalService bankingAppWithdrawalService = new BankingAppWithdrawalService();
        Account currentAccount = new CurrentAccount();
        bankingAppWithdrawalService.deposit(BigDecimal.valueOf(100), currentAccount);
        bankingAppWithdrawalService.withdraw(BigDecimal.valueOf(50), currentAccount);

        // liskov

        //interface segregation
        Payment bankPayment = new BankPayment();

        //dependency inversion
        BookService bookService = new BookService(new IsbnGenerator());
        bookService.createBook("W pustyni i w puszczy ");
    }
}
