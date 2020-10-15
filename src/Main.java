import jdk.swing.interop.SwingInterOpUtils;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        System.out.println("hej");
        System.out.println("hej hej");

        Customer Olle = new Customer("Olle Olson", "Gatgatan 3");
        Customer Monica = new Customer( "Monica Månsdotter", "Lillgatan 22");
        Customer Anna = new Customer ("Anna Andersdotter", "Storgatan 5");

        Employee Stina = new Employee("Stina Stinadotter", "Svänggatan 8", 32000);
        Employee Nils = new Employee("Nils Nilsson", "Vägvägen 7", 32000);

        Account a1 = new Account(1234, 1.2, "2019-08-05", Stina);
        Account a2 = new Account(2345, 1.4, "2020-08-10", Nils);
        Account a3 = new Account (9876, 1.3, "2019-10-02", Nils);
        Account a4 = new Account (7623, 1.3, "2018-11-12", Stina);
        Olle.addAccount(a1);
        Anna.addAccount(a2);
        Monica.addAccount(a3);
        Monica.addAccount(a4);

        Olle.changeInterestOnAccount(a1, 1.3, "2020-09-12", Nils);

        System.out.println("ena kontot " + Olle.accounts.get(0).getWhoChangedInterest().getName());
        System.out.println("andra kontot " + Olle.accounts.get(1).getWhoChangedInterest().getName());
        System.out.println("andra kontot " + Olle.accounts.get(1).getInterest());
        System.out.println("Första kontot. Startdatum: " + Olle.accounts.get(0).getStartDate() + " och slutdatum om det " +
                "finns: " + Olle.accounts.get(0).getStopDate());
        //System.out.println("Det var följande antal dagar som Olle hade den räntan på det kontot: "
          //      + ChronoUnit.DAYS.between(Olle.accounts.get(0).getStartDate(), Olle.accounts.get(0).getStopDate());


        //test av datum
        LocalDate firstDate = LocalDate.parse("2015-01-02");
        //String firstDate = "2015-01-02"; //fungerar inte.
        System.out.println(firstDate);
        //LocalDate secondDate = LocalDate.parse("2017-01-25");
        LocalDate secondDate = LocalDate.of(2017, 01, 25);

        LocalDate date = LocalDate.of(2020, 1, 8);
        System.out.println(date);

        System.out.println("Dagar emellan: " + ChronoUnit.DAYS.between(firstDate, secondDate));
        System.out.println("Antal dagar: " + a1.daysBetweenTwoDates("2013-10-01", "2018-10-01"));

        LocalDate date3 =  LocalDate.of(2017, 01, 15);
        LocalDate dateToday = LocalDate.now();
        System.out.println("Idag är det datum " + dateToday);
    }
}
