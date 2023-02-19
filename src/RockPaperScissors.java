import java.util.Scanner; //Import of Scanner
public class RockPaperScissors
{
    public static void main(String[] args)
    {

            String playerA = "";
            String playerB = "";
            boolean done = false;
            String YesOrNo = "";
            Scanner in = new Scanner(System.in);
            String trash = "";

        do
        {

            System.out.print("Player A choose one: R, P or S ");
            playerA = in.nextLine();
            System.out.print("Player B choose one: R, P or S ");
            playerB = in.nextLine();

            if (playerA.equalsIgnoreCase("R"))
            {
                if (playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("It's a tie R x R");
                    }
                else if (playerB.equalsIgnoreCase("P"))
                    {
                        System.out.println("Paper covers rock Player B wins");
                    }
                else //playB is scissors
                    {
                        System.out.println("Rock breaks scissors Player A wins");
                    }
                System.out.print("Are you done playing? ");
                YesOrNo = in.nextLine();
                if(YesOrNo.equalsIgnoreCase("Y"))
                {
                    done = true;
                }
            }
            else if (playerA.equalsIgnoreCase("P"))
            {
                if (playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("Paper covers rock Player A wins");
                    }
                else if (playerB.equalsIgnoreCase("P"))
                    {
                        System.out.println("It's a tie P x P");
                    }
                else //playerB is scissors
                    {
                        System.out.println("Scissors cuts paper Player B wins");
                    }
                System.out.print("Are you done playing? ");
                YesOrNo = in.nextLine();
                if(YesOrNo.equalsIgnoreCase("Y"))
                {
                    done = true;
                }
            }
            else //playerA is scissors
            {
                if (playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("Rock breaks scissors Player B wins");
                    }
                else if (playerB.equalsIgnoreCase("P"))
                    {
                        System.out.println("Scissors cuts paper Player A wins");
                    }
                else //playerB is scissors
                    {
                        System.out.println("It's a tie S x S");
                    }
                System.out.print("Are you done playing? ");
                YesOrNo = in.nextLine();
                if(YesOrNo.equalsIgnoreCase("Y"))
                {
                    done = true;
                }
            }
        } while(!done);
    }
}