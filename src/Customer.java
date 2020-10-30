import java.io.Serializable;
import java.util.ArrayList;
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
public class Customer extends Person implements BankData2 {
    private List<Account> accounts; //lista med nuvarande och tidigare insättningskonton. Ny ränta = nytt lån.
    private List<Loan> loans;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public Customer (String name, String address){
        super (name, address);
        accounts = new ArrayList<>();
        loans = new ArrayList<>();
    }

    public void addAccount (Account newAccount) {
        System.out.println("test test");
        boolean accountHasExisted = false;
        if (accounts.size()>0)
            for (int i = 0; i < accounts.size(); i++) {
                if (accounts.get(i).getNumberAccountLoan() == newAccount.getNumberAccountLoan()) {
                    //accounts.add(i, newAccount); //fungerade inte ser det ut som.
                    newAccount.addToPreviousAccounts(accounts.get(i));
                    accountHasExisted = true;
                    accounts.remove(i);
                    accounts.add(newAccount);
                    System.out.println("test. Nytt konto har gammalt i array? " + newAccount.getPreviousAccounts().get(0).getStartDate()); //test
                }
            }
        else //if (accountHasExisted == false)
            accounts.add(newAccount);

        //accounts.add(account);

    }

    public void addLoan (Loan loan){
        loans.add(loan); //loans är en lista.
    }

    public List<BankData2> changeInterestOnAccount (Account account, double newInterest, String date,
                                         Employee employee, List<BankData2> list, Customer customer){ //detta startar ett nytt kontoobjekt
        account.setStopDate(date);
        Account accountNew = new Account(account.getNumberAccountLoan(), newInterest, date, employee, account.getBalance(), customer);
        accountNew.setPreviousAccounts(account.getPreviousAccounts());
        addAccount(accountNew); //se metod ovan.
        list.add(accountNew); //ta bort? Justera?
        return list;

    }

    public void changeInterestOnLoan (Loan loan, double newInterest, String date,
                                         Employee employee){ //detta startar ett nytt kontoobjekt
        loan.setStopDate(date);
        Loan loanNew = new Loan(loan.getNumberAccountLoan(), newInterest, date, employee, loan.getBalance());
        addLoan(loanNew); //se metod ovan.

    }


}
