import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcom to Rock paper scissors.");
        System.out.println("Choose your weapon:\t\tr for rock\t\tp for paper\t\t s for scissors");
        // Now that we have the introduction in our console.
        String weapon = scan.next(); // now the player will choose what they will play with.
        int computer = (int) (Math.random() * 3); // this now makes it possible for the computer to choose
        // a random weapon between 3 numbers.
        if (weapon.equals("r"))
        {
            if(computer == 0)// Now using numbers, we give computer its weapon.v
            {
                System.out.println("computer chose rock also, its a draw(:"); // from here we mark different possibilities and outcomes.
            }
            else if(computer == 1)
            {
                System.out.println("computer chose paper, you loose!");
            }
            else if (computer == 2)
            {
                System.out.println("computer chose scissors, you win!!!");
            }
        }
        else if (weapon.equals("p")) // Now we look at possibilities of the player choosing paper.
        {
            if (computer == 0) {
                System.out.println("computer chose rock, you win!!!");
            } else if (computer == 1) {
                System.out.println("computer also chose paper, its a draw(:");
            } else if (computer == 2) {
                System.out.println("computer chose scissors, you sadly lose ):");
            }
        }
        else if (weapon.equals("s")) // Now possibilities for choosing scissors.
        {
            if (computer == 0)
            {
                System.out.println("computer chose rock, you lost!!");
            }
            else if (computer == 1)
            {
                System.out.println("computer chose paper, you win!!!!");
            }
            else if (computer == 2)
            {
                System.out.println("computer chose scissors, you know who else did?");
            }
        }
        else // And finally, to avoid any errors, we use else to tell the player they need to choose a weapon.
        {
            System.out.println("You did not choose any weapon, sorry but you can't play(;");
        }

    }
}
