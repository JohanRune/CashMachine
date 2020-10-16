import java.io.Serializable;

/**
 * Created by Johan Rune
 * Date: 2020-10-01
 * Time: 17:37
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Person implements BankData2, Serializable {
    private String name;
    private String address;

    public Person (String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
