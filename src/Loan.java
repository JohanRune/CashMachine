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

    public Loan (int loanNumber, double interest, String startDate, Employee employeeWhoAccepted) {
        super (loanNumber, interest, startDate, employeeWhoAccepted);
    }

}
