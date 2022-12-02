/**
 * Joshua Welch
 * Module 9
 * Arrays
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class jwelch_module_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Set up the list we will use real quick
        List<Integer> list = new ArrayList<>();
        while (list.size() < 20) {
            System.out.println("Please input a whole number. (An integer)");
            int newNumber = scanner.nextInt();
            list.add(newNumber);
        }
        //convert my list to an array.
        Object array[]=list.toArray();
        
        //Set up a bunch of variables to be used.
        int max = (int) array[0];
        int min = (int) array[0];
        int sum = 0;
        double average = 0.0;
        
        for (int i=0;i<array.length;i++) {
            if ((int)array[i] > max) {max=(int) array[i];}
            if ((int)array[i] < min) {min=(int) array[i];}
            sum += (int)array[i];
        }
        //Since I know there is only 20 elements I'll hardcode the 20, but it would be better
        //to put it as array.size() as the division. (Basically I know, I know)
        average = sum/20;
        System.out.println("The maximum value entered is: "+ max);
        System.out.println("The smallest value that was entered is "+min);
        System.out.println("The sum of all the values entered was "+sum);
        System.out.println("The average of the values entered was: "+average);
    }
}