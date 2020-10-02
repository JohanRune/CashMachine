import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Created by Johan Rune
 * Date: 2020-10-02
 * Time: 07:40
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Interest {
    private int numberAccountLoan; //konto eller lånenummer
    private double interest; //ränta
    private String startDate;
    private String stopDate;
    private Person whoChangedInterest;

    public Interest (int Number, double interest, String startDate, Employee employee){
        this.numberAccountLoan = Number;
        this.interest = interest;
        this.startDate = startDate;
        this.whoChangedInterest = employee;
    }

    public int getNumberAccountLoan() {
        return numberAccountLoan;
    }

    public void setNumberAccountLoan(int number) {
        this.numberAccountLoan = number;
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

    public long daysBetweenTwoDates (String startDate, String stopDate){
        LocalDate firstDate = LocalDate.parse(startDate);
        LocalDate secondDate = LocalDate.parse(stopDate);
        return ChronoUnit.DAYS.between(firstDate, secondDate);
    }


}
