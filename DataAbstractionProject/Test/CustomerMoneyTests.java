import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class CustomerMoneyTests
{
    Customer test;

    public static final double delta = 0.001;

    @Before
    public void setup()
    {
        test = new Customer("test",1,20,10);
    }

    @Test
    public void testDeposit()
    {
        test.deposit(5, new Date(), Customer.CHECKING);
        assertEquals(25,test.getCheckBalance(), delta);

        test.deposit(9, new Date(), Customer.SAVING);
        assertEquals(19, test.getSavingBalance(), delta);

        test.deposit(10, new Date(), Customer.CHECKING);
        assertEquals(35, test.getCheckBalance(), delta);

    }

    @Test
    public void testWithdraw()
    {
        test.withdraw(5, new Date(), Customer.CHECKING);
        assertEquals(15,test.getCheckBalance(), delta);

        test.withdraw(10, new Date(), Customer.SAVING);
        assertEquals(0, test.getSavingBalance(), delta);

        test.withdraw(10, new Date(), Customer.SAVING);
        assertEquals(0 ,test.getSavingBalance(), delta);

        test.withdraw(30, new Date(), Customer.CHECKING);
        assertEquals(15, test.getCheckBalance(), delta);
    }
}
