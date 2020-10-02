
public class Main {

    public static void main(String[] args) {
        System.out.println("hej");
        System.out.println("hej hej");

        Customer Olle = new Customer("Olle Olson", "Gatgatan 3");
        Customer Monica = new Customer( "Monica Månsdotter", "Lillgatan 22");
        Customer Anna = new Customer ("Anna Andersdotter", "Storgatan 5");

        Employee Stina = new Employee("Stina Stinadotter", "Svänggatan 8", 32000);
        Employee Nils = new Employee("Nils Nilsson", "Vägvägen 7", 32000);

        Account a1 = new Account(1234, 1.2, "20190805", Stina);
        Account a2 = new Account(2345, 1.4, "20200810", Nils);
        Account a3 = new Account (9876, 1.3, "20191002", Nils);
        Account a4 = new Account (7623, 1.3, "20181112", Stina);
        Olle.addAccount(a1);
        Anna.addAccount(a2);
        Monica.addAccount(a3);
        Monica.addAccount(a4);

        Olle.changeInterestOnAccount(a1, 1.3, "20200912", Nils);

        System.out.println("ena kontot " + Olle.accounts.get(0).getWhoChangedInterest().getName());
        System.out.println("andra kontot " + Olle.accounts.get(1).getWhoChangedInterest().getName());
        System.out.println("andra kontot " + Olle.accounts.get(1).getInterest());
    }
}
