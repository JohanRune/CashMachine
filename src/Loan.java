import javax.print.DocFlavor;
import java.util.Date;
import java.util.List;

/**
 * Created by Johan Rune
 * Date: 2020-10-01
 * Time: 17:38
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Loan extends Interest{
    List<Loan> loanList;

    public Loan (int accountNumber, double interest, String startDate, Employee employee) {
        super (accountNumber, interest, startDate, employee);
    }

}
