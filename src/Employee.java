/**
 * Created by Johan Rune
 * Date: 2020-10-01
 * Time: 17:38
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Employee extends Person implements BankData2{
    private int salary;

    public Employee (String name, String address, int salary){
        super (name, address);
        this.salary = salary;
    }
}
