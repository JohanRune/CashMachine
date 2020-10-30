import org.w3c.dom.ls.LSOutput;
//ta bort
import java.util.List;
import java.util.Scanner;

/**
 * Created by Johan Rune
 * Date: 2020-10-15
 * Time: 16:05
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class CustomerInteraction {
    List<Customer> customers;

    public CustomerInteraction(List<Customer> customerList) {
        this.customers = customerList;
    }

    public void CustomerInteraction() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vad heter du?");
        String name = scanner.nextLine();
        Customer customer = identifyCustomer(name);
        System.out.println("Välj i menyn");
        System.out.println("För att se kontoöversikt, tryck 1");
        System.out.println("För att ta ut pengar, tryck 2");
        int översiktEllerUttag = scanner.nextInt();


        if (översiktEllerUttag == 1) {
//            System.out.println("Namnet är " + customer.getName());

            for (int i = 0; i < customer.getAccounts().size(); i++) {
                System.out.println("Kontot " + customer.getAccounts().get(i).getNumberAccountLoan() +
                        " har balansen " + customer.getAccounts().get(i).getBalance() + " kr.");
            }
        }
        System.out.println("Hallå " + customer.getAccounts());


        if (översiktEllerUttag == 2) {
            int choiceOfAccount;
            Account accountToWithdrawFrom;

            System.out.println("Från vilket konto vill du ta ut?");
            for (int i = 1; i <= customer.getAccounts().size(); i++) {
                System.out.print(i + " ");
                System.out.println(customer.getAccounts().get(i - 1).getNumberAccountLoan());
            }
            choiceOfAccount = scanner.nextInt();
            accountToWithdrawFrom = customer.getAccounts().get(choiceOfAccount - 1);
            System.out.println("konto att dra ifrån " + accountToWithdrawFrom.getNumberAccountLoan() + ". Saldo " + accountToWithdrawFrom.getBalance());

            System.out.println("Hur mycket vill du ta ut?");
            int withdrawal = scanner.nextInt();

            while (withdrawal > accountToWithdrawFrom.getBalance()) {
                System.out.println("Du har valt ett för stort belopp. Försök igen!");
                withdrawal = scanner.nextInt();
            }
            System.out.println("Här är dina pengar.");
            System.out.println("Balans före uttag: " + accountToWithdrawFrom.getBalance());
            accountToWithdrawFrom.setBalance(accountToWithdrawFrom.getBalance()-withdrawal);
            System.out.println("Balans efter uttag: " + accountToWithdrawFrom.getBalance());
        }
        }




    public Customer identifyCustomer (String name){
        System.out.println("hej hej");
        System.out.println("storlek array " + customers.size());
        System.out.println("index 2 " + customers.get(2).getName());
        System.out.println("namnet som är indata " + name);
        for (int i = 0; i < customers.size(); i++) {
            System.out.println("index: " + i);
            if ((customers.get(i).getName()).equalsIgnoreCase(name.trim())) {
                System.out.println("Kundens namn: " + customers.get(i).getName());
                return customers.get(i);
            }

        }
        System.out.println("Ni har inga konton i banken. Programmet avslutas");
        System.exit(0);
        return null;
    }

}
