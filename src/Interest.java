import java.util.Date;

/**
 * Created by Johan Rune
 * Date: 2020-10-02
 * Time: 07:40
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Interest {
    private int accountNumber;
    private double interest; //ränta
    private String startDate;
    private String stopDate;
    private Person whoChangedInterest;

    public Interest (int accountNumber, double interest, String startDate, Employee employee){
        this.accountNumber = accountNumber;
        this.interest = interest;
        this.startDate = startDate;
        this.whoChangedInterest = employee;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStopDate() {
        return stopDate;
    }

    public void setStopDate(String stopDate) {
        this.stopDate = stopDate;
    }

    public Person getWhoChangedInterest() {
        return whoChangedInterest;
    }

    public void setWhoChangedInterest(Person whoChangedInterest) {
        this.whoChangedInterest = whoChangedInterest;
    }
}
