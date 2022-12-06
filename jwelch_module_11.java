/**
 * Joshua Welch
 * Module 11
 * Array location
 */
import java.util.Random;
import java.util.Arrays;

public class jwelch_module_11 {
    //double framework for array location
    private static int [] locateLargest (double [][] arrayParam) {
        int [] largestLocation = new int[2];
        double largestElement = 0;
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largestElement) {
                    largestElement = arrayParam[i][j];
                    largestLocation[0] = i;
                    largestLocation[1] = j;
                }
            }
        }
        return largestLocation;
    }
    //int framework for array location
    private static int [] locateLargest (int [][] arrayParam) {
        int [] largestLocation = new int[2];
        int largestElement = 0;
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largestElement) {
                    largestElement = arrayParam[i][j];
                    largestLocation[0] = i;
                    largestLocation[1] = j;
                }
            }
        }
        return largestLocation;
    }
    //main!!!
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        Random rand = new Random();
        //make int array
        int[][] array = new int[rows][columns];
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = rand.nextInt(100);
            }
        }
        
        //make double array
        double[][] array_2 = new double[rows][columns];
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j < columns; j++) {
                array_2[i][j] = rand.nextInt(100);
            }
        }

        //check int array
        int[] intLocation = locateLargest(array);
        //check double array
        int[] doubleLocation = locateLargest(array_2);

        //print int array
        System.out.println("----------INT ARRAY----------");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array[i]));
          }
        System.out.println("The spot that you seek is " + intLocation[0]+","+intLocation[1] + " which is: " + array[intLocation[0]][intLocation[1]]);
        //print double array
        System.out.println("----------DOUBLE ARRAY----------");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array_2[i]));
          }
        System.out.println("The spot that you seek is " + doubleLocation[0]+","+doubleLocation[1] + " which is: " + array_2[doubleLocation[0]][doubleLocation[1]]);
    }
}