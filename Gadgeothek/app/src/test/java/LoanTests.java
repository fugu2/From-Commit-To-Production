import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import ch.hsr.mge.gadgeothek.domain.Gadget;
import ch.hsr.mge.gadgeothek.domain.Loan;

/**
 * Created by user on 28.10.17.
 */

public class LoanTests {

    @Test
    public void shouldBeOverdue() {
        Calendar returnDate = Calendar.getInstance();
        returnDate.add(Calendar.DAY_OF_YEAR, -10);
        Calendar pickupDate = Calendar.getInstance();
        pickupDate.add(Calendar.DAY_OF_YEAR, -30);
        Loan loan = new Loan("someId", new Gadget("test"), pickupDate.getTime(), returnDate.getTime());
        boolean isOverdue = loan.isOverdue();
        Assert.assertThat(isOverdue, Is.is(false));
    }
}
