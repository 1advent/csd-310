/**
 * Joshua Welch
 * Module 10
 * Class Overloading
 */
public class jwelch_module_10 {
    // This is the various version of the same method.
    public static short average(short [] array){
        System.out.println("----------Short------------");
        System.out.println("The contents of the array are: ");
        System.out.print("(");
        int sum=0;
        for (int i=0;i<array.length;i++) {
            sum += array[i];
            System.out.print(array[i]+ ", ");
        }
        System.out.print(")");
        System.out.println("");
        short newShort = (short) (sum/array.length);
        return newShort;
    }
    public static int average(int [] array){
        System.out.println("-----------Int-----------");
        System.out.println("The contents of the array are: ");
        System.out.print("(");
        int sum=0;
        for (int i=0;i<array.length;i++) {
            sum += array[i];
            System.out.print(array[i]+ ", ");
        }
        System.out.print(")");
        System.out.println("");
        int newInt = (int) (sum/array.length);
        return newInt;
    }
    public static long average(long [] array){
        System.out.println("------------Long----------");
        System.out.println("The contents of the array are: ");
        System.out.print("(");
        int sum=0;
        for (int i=0;i<array.length;i++) {
            sum += array[i];
            System.out.print(array[i]+ ", ");
        }
        System.out.print(")");
        System.out.println("");
        long newLong = (long) (sum/array.length);
        return newLong;
    }
    public static double average(double [] array){
        System.out.println("-------------Double---------");
        System.out.println("The contents of the array are: ");
        System.out.print("(");
        int sum=0;
        for (int i=0;i<array.length;i++) {
            sum += array[i];
            System.out.print(array[i]+ ", ");
        }
        System.out.print(")");
        System.out.println("");
        double newDouble = (double) (sum/array.length);
        return newDouble;
    }
    public static void main(String[] args) {
        //first int
        int[] IntNumbs = {13, 17, 12, 15, 11};
        double avg = average(IntNumbs);
        System.out.println("The average of the int is: " + avg + "\n");
        //then double
        double[] DoubleNumbs = {102.3, 100.0, 90.0, 100.0, 60.0, 45.0};
        avg = average(DoubleNumbs);
        System.out.println("The average of the double is: " + avg + "\n");
        //then the long
        long[] LongNumbs = {123456712L, 1223L, 2346L, 4556L, 0L, 56L, 9513503188L};
        avg = average(LongNumbs);
        System.out.println("The average of the long is: " + avg + "\n");
        //then the short
        short[] ShortNumbs = {-52, 23, 12, 34, 98, 1003, 2022, 1225, 1985, 2004, -3};
        avg = average(ShortNumbs);
        System.out.println("The average of the shorts is: " + avg + "\n");

    }

}