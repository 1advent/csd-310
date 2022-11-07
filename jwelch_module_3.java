import java.util.Random;
import java.util.Scanner;


/**
 * jwelch_module_3
 */
public class jwelch_module_3 {

    public static void main(String[] args) {
        int play_again = 1;
        Scanner input = new Scanner(System.in);
        /*
         * Readability was an issue, so I'm going to use names instead of numbers, so refactor time!
         */
        while(play_again == 1) {

            //get a new number from the computer
            String selection = generate_number();
            
            //welcome screen:
            System.out.println("Welcome to rock, paper scissors.");
            System.out.println("Please follow the menu below to make your selection:");
            menu();
            int num_user_selection = input.nextInt();
            //make selection a word instead
            String user_selection="";
            if (num_user_selection == 1) {
                user_selection = "rock";
            } else if (num_user_selection == 2) {
                user_selection = "paper";
            } else if (num_user_selection == 3) {
                user_selection = "scissors";
            }
            //figure who won
            int winner = returnWinner(selection, user_selection);
            System.out.println("The computer choose " + selection + " and the user choose " + user_selection);
            System.out.println("Therefore: ");
            //print winner information
            if (winner != 0) {
                if (winner == 1) {
                    System.out.println("User wins!!!");
                } else {
                    System.out.println("Computer wins!!");
                }
            } else {
                System.out.println("Push, No one wins.");
            }
            System.out.println("Would you like to play again? 1 for yes, 0 for no: ");
            play_again = input.nextInt();
            
         }
         input.close();

    }
    //determine winner
    /*
     * rock
     * paper
     * scissors
     */
    public static int returnWinner(String selection, String user_selection) {
        //push no one wins
        if (user_selection == selection) {
            return 0;
        }
        //this could use or statements but it would be hard to read.
        //was using numbers here but it was confusing.
        if (user_selection == "rock" && selection == "scissors"){
            return 1;
        } else if (user_selection == "scissors" && selection == "paper") {
            return 1;
        } else if (user_selection == "paper" && selection =="rock") {
            return 1;
        }
        //otherwise the computer wins
        return 2;
    }
    public static void menu() {
        System.out.println("Please press 1 for Rock");
        System.out.println("Please press 2 for Paper");
        System.out.println("Please press 3 for Scissors");
        System.out.println("");
    }
    public static String generate_number() {
        //random number, plus 1 so it is 1-3 instead of 0-2
        double doubleSelection = Math.random() * 3 + 1;
        int num = (int)doubleSelection;
        String selection = "";
        if (num == 1) {
            selection = "rock";
        } else if (num == 2) {
            selection = "paper";
        } else if (num == 3) {
            selection = "scissors";
        }
        return selection;
        
    }
}