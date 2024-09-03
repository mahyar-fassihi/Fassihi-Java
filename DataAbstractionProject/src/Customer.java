//import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer
{
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer()
    {
        //create default constructor
        accountNumber = 0;
        deposits = new ArrayList<Deposit>();
        withdraws = new ArrayList<Withdraw>();
        checkBalance = 0;
        savingBalance = 0;
        savingBalance = 0.05;
        name = "";
    }

    Customer(String name, int accountNumber, double checkBalance, double savingBalance)
    {
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkBalance;
        this.savingBalance = savingBalance;
        deposits = new ArrayList<Deposit>();
        withdraws = new ArrayList<Withdraw>();
    }

    //Requires: double amount, date, and the account.
    //Modifies: Customer's Balance.
    //Effects: Adds the selected amount to the Customer's Balance.

    public double deposit(double amt, Date date, String account)
    {
        if (account.equals(CHECKING))
        {
            checkBalance += amt;
            Deposit deposit = new Deposit(amt, date, account, checkBalance);
            deposits.add(deposit);
            return checkBalance;
        }
        else if (account.equals(SAVING))
        {
            savingBalance += amt;
            Deposit deposit = new Deposit(amt, date, account, checkBalance);
            deposits.add(deposit);
            return savingBalance;
        }
        System.out.println("There is no account name as that.");
        return 0;
    }

    //Requires: double amount, date, and the account.
    //Modifies: Customer's Balance.
    //Effects: removes the selected amount from the Customer's Balance.
    public double withdraw(double amt, Date date, String account)
    {
        //your code here
        if (checkOverdraft(amt, account))
        {
            if (account.equals(CHECKING))
            {
                if (checkBalance == 0)
                {
                    System.out.println();
                }
                checkBalance -= amt;
                Withdraw withdraw = new Withdraw(amt, new Date(), account, checkBalance);
                withdraws.add(withdraw);
                return checkBalance;
            }
            else if (account.equals(SAVING))
            {
                savingBalance -= amt;
                Withdraw withdraw = new Withdraw(amt, new Date(), account, savingBalance);
                withdraws.add(withdraw);
                return savingBalance;
            }
            System.out.println("There is no account name as that.");
            return 0;
        }
        else
        {
            System.out.println("You do not have enough money.");
            return 0;
        }
    }


    //Requires: double amount and the account.
    //Effects: Checks if the selected amount for withdrawl is bigger than the money inside of the balance.
    private boolean checkOverdraft(double amt, String account)
    {
        //your code here
        if (account.equals(CHECKING))
        {
            if (amt > checkBalance)
            {
                return false;
            } else
            {
                return true;
            }
        } else if (account.equals(SAVING))
        {
            if (amt > savingBalance)
            {
                return false;
            } else
            {
                return true;
            }
        } else
        {
            System.out.println("That is not a valid account");
            return false;
        }
    }

    //do not modify
    //Requires: Nothing.
    //Modifies: Nothing.
    //Effects: Shows all the history of deposits made.
    public void displayDeposits()
    {
        for (Deposit d : deposits)
        {
            System.out.println(d);
        }
    }

    //do not modify
    //Requires: Nothing.
    //Modifies: Nothing.
    //Effects: Shows all the history of withdraws made.
    public void displayWithdraws()
    {
        for (Withdraw w : withdraws)
        {
            System.out.println(w);
        }
    }

    public double getCheckBalance()
    {
        return checkBalance;
    }

    public void setCheckBalance(double checkBalance)
    {
        this.checkBalance = checkBalance;
    }

    public double getSavingBalance()
    {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance)
    {
        this.savingBalance = savingBalance;
    }
}
