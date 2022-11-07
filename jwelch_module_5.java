/**
 * jwelch_module_5
 */
public class jwelch_module_5 {

    public static void main(String[] args) {
        int i = 3;
        double result = 0;
        String s = "";
        //intro:
        System.out.println("We will start small and go big, first: ");
        System.out.println("The math problem is: ");
        while (i <= 99) {
            //this is the string for the math problem.
            s += "1 / " + i + " + ";
            //Using literals to control data types
            result = result + 1.0/i;
            //increment.
            i = i + 2;
        }
        //chop off last + sign so it can be an equal instead.
        s = s.substring(0, s.length() - 2);
        System.out.println(s + "= " + result);
        System.out.println("This is going down instead of up: ");
        //reset variables
        i = 99;
        s = "";
        result = 0.0;
        //backwards while loop
        while (i >= 3) {
            //this is the string for the math problem.
            s += "1 / " + i + " + ";
            //Using literals to control data types
            result = result + 1.0/i;
            //increment.
            i = i - 2;
        }
        //chop off last + sign so it can be an equal instead.
        s = s.substring(0, s.length() - 2);
        System.out.println(s + "= " + result);
    }
}