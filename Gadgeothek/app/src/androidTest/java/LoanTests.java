import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

import ch.hsr.mge.gadgeothek.domain.Loan;

/**
 * Created by user on 28.10.17.
 */

public class LoanTests {

    @Test
    public void shouldBeOverdue() {
        Calendar calendar = Calendar.getInstance();
        Loan loan = new Loan(null, null, null, null);
        boolean isOverdue = loan.isOverdue();
        Assert.assertThat(isOverdue, Is.is(true));
    }
}
