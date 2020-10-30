import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Johan Rune
 * Date: 2020-10-01
 * Time: 17:36
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Sprint1_5_CashMachine {

    public void CachMachine() {
        List<Customer> customerList = new ArrayList<>();
        List<BankData2> bankData = new ArrayList<>();

        Customer Olle = new Customer("Olle O", "Gatgatan 3");
        Customer Monica = new Customer("Monica M", "Lillgatan 22");
        Customer Anna = new Customer("Anna A", "Storgatan 5");
        Customer Diamant = new Customer("Diamant D", "Stengatan 8");
        customerList.add(Olle);
        customerList.add(Monica);
        customerList.add(Anna);
        customerList.add(Diamant);
        bankData.add(Olle);
        bankData.add(Monica);
        bankData.add(Anna);
        System.out.println(bankData.get(0).getClass());
        Customer c1 = (Customer) bankData.get(0);
        System.out.println("namn " + c1.getName());
        System.out.println("Anna: " + customerList.get(2).getName());

        Employee Stina = new Employee("Stina Stinadotter", "Svänggatan 8", 32000);
        Employee Nils = new Employee("Nils Nilsson", "Vägvägen 7", 32000);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Stina);
        employeeList.add(Nils);
        bankData.add(Stina);
        bankData.add(Nils);

        Account a1 = new Account(1234, 1.2, "2019-08-05", Stina, 10_000, Olle);
        Account a2 = new Account(2345, 1.4, "2020-08-10", Nils, 15_000, Anna);
        Account a3 = new Account(9876, 1.3, "2019-10-02", Nils, 24_000, Monica);
        Account a4 = new Account(7623, 1.3, "2018-11-12", Stina, 5_000, Monica);
        Olle.addAccount(a1);
        Anna.addAccount(a2);
        Monica.addAccount(a3);
        Monica.addAccount(a4);
        List<Account> accountsList = new ArrayList<>();
        accountsList.add(a1);
        accountsList.add(a2);
        accountsList.add(a3);
        accountsList.add(a4);
        bankData.add(a1);
        bankData.add(a2);
        bankData.add(a3);
        bankData.add(a4);
        System.out.println("Monicas ena konto " + Monica.getAccounts().get(0).getBalance());

        bankData = Olle.changeInterestOnAccount(a1, 1.3, "2020-09-12", Nils, bankData, Olle);

        System.out.println("Slutdatum: " + a1.getStopDate());

        Loan l1 = new Loan(5678, 2.0, "2015-11-10", Stina, 100_000);
        Loan l2 = new Loan(5623, 2.2, "2017-03-15", Nils, 150_000);
        Olle.addLoan(l1);
        Anna.addLoan(l2);
        List<Loan> loansList = new ArrayList<>();
        loansList.add(l1);
        loansList.add(l2);
        bankData.add(l1);
        bankData.add(l2);


        SerializationManager sm = new SerializationManager();
        sm.serializeList (bankData, "bankData.ser");

        //Olle.setName("Jackie");

        //SerializationManager sm = new SerializationManager();

        //List<BankData2> bankDataTest = new ArrayList<>();
        bankData = sm.deSerializeList();
        //bankDataTest = sm.deSerializeList();
        System.out.println("första to string " + bankData.get(0).toString());
        Customer c = (Customer) bankData.get(0);
        System.out.println("namn på c " + c.getName());

        CustomerInteraction interaction = new CustomerInteraction(customerList);
        interaction.CustomerInteraction();

/*
        System.out.println("ena kontot " + Olle.accounts.get(0).getWhoChangedInterest().getName());
        System.out.println("andra kontot " + Olle.accounts.get(1).getWhoChangedInterest().getName());
        System.out.println("andra kontot " + Olle.accounts.get(1).getInterest());
        System.out.println("Första kontot. Startdatum: " + Olle.accounts.get(0).getStartDate() + " och slutdatum om det " +
                "finns: " + Olle.accounts.get(0).getStopDate());
        //System.out.println("Det var följande antal dagar som Olle hade den räntan på det kontot: "
        //      + ChronoUnit.DAYS.between(Olle.accounts.get(0).getStartDate(), Olle.accounts.get(0).getStopDate());

*/

            }
}

