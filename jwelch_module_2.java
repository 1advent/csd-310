import java.util.Scanner;

/**
 * jwelch_module_2
 */
public class jwelch_module_2 {

    public static void main(String[] args) {
        //Setup the variables I will use
        double waterMass;
        double initialTemperature;
        double finalTemperature;
        double Q;

        //setup the stupid scanner thing.
        Scanner input = new Scanner(System.in);

        //ask setup questions.
        System.out.println("Print the number of kilos of water you are starting with: ");
        waterMass = input.nextDouble();
        System.out.println("What is the starting temperature in Celcius: ");
        initialTemperature = input.nextDouble();
        System.out.println("What is the ending temperature of the water in Celcius: ");
        finalTemperature = input.nextDouble();

        //close the stupid scanner
        input.close();

        //do calculation
        Q = waterMass * ( finalTemperature - initialTemperature ) * 4184;

        //output answer
        System.out.println(("The result in joules is: " + Q));
    }
}