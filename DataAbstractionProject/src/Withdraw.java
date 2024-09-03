import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;
    private double balance;

    Withdraw(double amount, Date date, String account, double balance){
        this.amount = amount;
        this.date = date;
        this.account = account;
        this.balance = balance;
    }

    public String toString()
    {
        //your code here
        if (account.equals(Customer.CHECKING))
            return "Withdraw of : " + amount + ", Date: " + date + ", into Account: " + account+ ". Current balance: " + balance ;
        else
            return "Withdraw of : " + amount + ", Date: " + date + ", into Account: " + account + ". Current balance: " + balance;
    }
}
