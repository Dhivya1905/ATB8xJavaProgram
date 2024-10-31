package Oct.ex_23102024_Exception_Continue;
import java.lang.Exception;
public class Bank {

    String currency;
    Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws Exception {

        if (!bankName.currency.equalsIgnoreCase("INR"))
           {
                throw new Exception("Currency Mismatch,Can't do sum");


        }
            return bankName.amount + this.amount;

    }

}

