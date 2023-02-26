import java.util.Scanner; //Import of Scanner Utility
public class RockPaperScissors
{
    public static void main(String[] args)
    {   //Declaration and assignment of all variables
        String playerA = "";
        String playerB = "";
        boolean done = false;
        String YesOrNo = "";
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean correctInputPlayerA = false;
        boolean correctInputPlayerB = false;

        do //Do While loop asking to play again or not
        {
            do //Start of Do While loop for testing playerA input
            {
                System.out.println("Player A choose one: R, P or S "); //Prompt user for input
                if (in.hasNextInt()) //Check if user input is an integer and not string
                    {
                        trash = in.nextLine(); //Assignment of bad input from user
                        System.out.println(trash + " is invalid input."); //Output statement of bad input to user
                    }
                else //Other choice on good input
                    {
                        playerA = in.nextLine(); //Assignment of correct user input
                        correctInputPlayerA = true; //Reassign variable condition to end loop
                    }
            } while (!correctInputPlayerA); //Boolean check for continuing user prompt

            do //Start of Do While loop for testing playerB input
            {
                System.out.println("Player B choose one: R, P or S "); //Prompt user for input
                if (in.hasNextInt()) //Check if user input is an integer and not string
                    {
                        trash = in.nextLine(); //Assignment of bad input from user
                        System.out.println(trash + " is invalid input."); //Output statement of bad input to user
                    }
                else //Other choice on good input
                    {
                        playerB = in.nextLine(); //Assignment of correct user input
                        correctInputPlayerB = true; //Reassign variable condition to end loop
                    }
            } while (!correctInputPlayerB); //Boolean check for continuing user prompt
            //Actual start of the game
            if (playerA.equalsIgnoreCase("R")) //Check playerA choice for Rock and convert to either case
            {
                if (playerB.equalsIgnoreCase("R")) //Check for playerB choice for Rock and convert to either case
                    {
                        System.out.println("It's a tie R x R"); //Tie output statement
                    }
                else if (playerB.equalsIgnoreCase("P")) //Check playerB for Paper choice and convert to either case
                    {
                        System.out.println("Paper covers rock Player B wins"); //Winner output statement
                    }
                else //Last of the 3 choices that playerB could be: Scissors
                    {
                        System.out.println("Rock breaks scissors Player A wins"); //Winner output statement
                    }
            }
            else if (playerA.equalsIgnoreCase("P")) //Check playerA choice for Paper and convert to either case
            {
                if (playerB.equalsIgnoreCase("R")) //Check for playerB choice for Rock and convert to either case
                    {
                        System.out.println("Paper covers rock Player A wins"); //Winner output statement
                    }
                else if (playerB.equalsIgnoreCase("P")) //Check for playerB choice for Paper and convert to either case
                    {
                        System.out.println("It's a tie P x P"); //Tie output statement
                    }
                else //Last of the 3 choices that playerB could be: Scissors
                    {
                        System.out.println("Scissors cuts paper Player B wins"); //Winner output statement
                    }
            }
            else //Last of the 3 choices that playerA could be: Scissors
            {
                if (playerB.equalsIgnoreCase("R")) //Check for playerB choice for Rock and convert to either case
                    {
                        System.out.println("Rock breaks scissors Player B wins"); //Winner output statement
                    }
                else if (playerB.equalsIgnoreCase("P")) //Check for playerB choice for Paper and convert to either case
                    {
                        System.out.println("Scissors cuts paper Player A wins"); //Winner output statement
                    }
                else //Last of the 3 choices that playerB could be: Scissors
                    {
                        System.out.println("It's a tie S x S"); //Tie output statement
                    }
            }

            System.out.print("Are you done playing? "); //Prompt users to play game again or not
            YesOrNo = in.nextLine(); //User input assigned to boolean variable
            if(YesOrNo.equalsIgnoreCase("Y")) //Convert user input to either case
                {
                    done = true; //Change of boolean variable from false because user chose Y or y
                }

        } while (!done) ; //Boolean check to see if user's are still playing
    }
}
