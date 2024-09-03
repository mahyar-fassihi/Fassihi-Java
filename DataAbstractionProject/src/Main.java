import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Customer brad = new Customer("Brad",1,20,10);

        brad.deposit(10, new Date(), Customer.CHECKING);

        brad.deposit(20, new Date(), Customer.CHECKING);
        brad.displayDeposits();

        brad.withdraw(20, new Date(), Customer.CHECKING);
        brad.displayWithdraws();

        brad.withdraw(100, new Date(), Customer.CHECKING);
    }
}
