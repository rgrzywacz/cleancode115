package interfacesegregation;

import java.util.ArrayList;
import java.util.List;

public class BankPayment implements Payment {

    @Override
    public void initiatePayments() {
        // ...
    }

    @Override
    public Object status() {
        return new Object();
        // ...
    }

    @Override
    public List<Object> getPayments() {
        return new ArrayList<>();
        // ...
    }

    @Override
    public void initiateLoanSettlement() {

    }

    @Override
    public void initiateRePayment() {

    }
}
