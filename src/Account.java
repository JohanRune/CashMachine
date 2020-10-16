import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Johan Rune
 * Date: 2020-10-01
 * Time: 18:08
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Account extends Interest implements BankData2{
    private List<Account> previousAccounts;

    public List<Account> getPreviousAccounts() {
        return previousAccounts;
    }

    public void addToPreviousAccounts(Account oldAccount){
        previousAccounts = new ArrayList<>();
        previousAccounts.add(oldAccount);
    }

    public void setPreviousAccounts(List<Account> previousAccounts) {
        this.previousAccounts = previousAccounts;
    }



    public Account (int accountNumber, double interest, String startDate, Employee whoChangedInterest, double balance) {
        super (accountNumber, interest, startDate, whoChangedInterest, balance);
    }

}
