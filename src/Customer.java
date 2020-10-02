import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Johan Rune
 * Date: 2020-10-01
 * Time: 17:37
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Customer extends Person{
    List<Account> accounts; //lista med nuvarande och tidigare insättningskonton. Ny ränta = nytt lån.
    List<Loan> loans;

    public Customer (String name, String address){
        super (name, address);
        accounts = new LinkedList<>();
        loans = new LinkedList<>();
    }

    public void addAccount (Account account) {
        accounts.add(account);
    }

    public void addLoan (Loan loan){
        loans.add(loan);
    }

    public void changeInterestOnAccount (Account account, double newInterest, String date,
                                         Employee employee){ //detta startar ett nytt kontoobjekt
        account.setStopDate(date);
        Account accountNew = new Account(account.getAccountNumber(), newInterest, date, employee);
        addAccount(accountNew); //se ovan.

    }



}
