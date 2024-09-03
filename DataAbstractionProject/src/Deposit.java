import java.util.Date;

public class Deposit
{
    private double amount;
    private Date date;
    private String account;
    private double balance;

    Deposit(double amount, Date date, String account, double balance)
    {
        this.amount = amount;
        this.date = date;
        this.account = account;
        this.balance = balance;
    }

    public String toString()
    {
        if (account.equals(Customer.CHECKING))
        return "Deposit of : " + amount + ", Date: " + date + ", into Account: " + account+ ". Current balance: " + balance ;
        else
        return "Deposit of : " + amount + ", Date: " + date + ", into Account: " + account + ". Current balance: " + balance;
    }
}
