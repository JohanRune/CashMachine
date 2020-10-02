import java.util.Date;

/**
 * Created by Johan Rune
 * Date: 2020-10-01
 * Time: 18:08
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Account extends Interest{

    public Account (int accountNumber, double interest, String startDate, Employee whoChangedInterest) {
        super (accountNumber, interest, startDate, whoChangedInterest);
    }


}
