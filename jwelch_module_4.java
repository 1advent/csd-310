import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * jwelch_module_4
 */
public class jwelch_module_4 {

    public static void main(String[] args) {
        //setup stupid scanner
        Scanner input = new Scanner(System.in);
        //setup our result variable
        boolean result = false;
        //prompt for strings:
        System.out.println("Please type out a string.");
        //my variables names aren't creative. I'm sorry.
        String s1 = input.nextLine();
        System.out.println("Please type out another string.");
        String s2 = input.nextLine();
        String s = "test string";
        //test one direction:
        result = testStrings(s1, s2);
        if (result) {
            System.out.println("The first string contains the second string");
        }
        //now, cleverly test the other direction:
        result = testStrings(s2, s1);
        if (result) {
            System.out.println("The second string contains the first string O_o");
        }
        //close stupid scanner
        input.close();
    }
    public static boolean testStrings(String s1, String s2) {
        return s1.contains(s2);
    }
}