import java.util.Scanner;

/**
 * jwelch_module_7
 */
public class jwelch_module_7 {

    public static void main(String[] args) {
        //set up the asking of the password:
        //setup the stupid scanner:
        Scanner input = new Scanner(System.in);
        //first the empty password string, because I like to know it is empty to start with.
        String password = "";
        //Then the incredibly long input question:
        System.out.println("Please input the password you wish to be checked:   ");
        //Then actually grabbing the input:
        password = input.nextLine();

        //NOW FOR CHECKS.
        //length
        if (password.length() < 8) {
            System.out.println("Your password is too short. Try again.");
            jwelch_module_7.main(null);
        }
        //using some backwards logic we check if there is at least one number:
        if (!password.matches(".*[0-9].*")){
            System.out.println("Your password must contain a number.");
            jwelch_module_7.main(null);
        }
        //using some backwards logic we check if there is at least one lower case letter:
        if (!password.matches(".*[a-z].*")){
            System.out.println("Your password must contain one lower case character.");
            jwelch_module_7.main(null);
        }
        //using some backwards logic we check if there is at least one upper case letter:
        if (!password.matches(".*[A-Z].*")){
            System.out.println("Your password must contain one upper case character.");
            jwelch_module_7.main(null);
        }
        input.close();
        System.out.println("This is acceptable.");
    }
}