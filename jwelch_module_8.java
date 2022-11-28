import java.text.DecimalFormat;

/**
 * Joshua Welch
 * Module 8
 * Method Overloading
 */
public class jwelch_module_8 {
    //give us a public variable
    public static double service_fee = 10;
    //formatting variable. I don't normally use these so nicely.
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        //Time to test our beautiful methods.
        double charges = 54.99; //this will be the two tests, one here
        outputtingTotals(charges);
        charges = 99.95; //one here
        outputtingTotals(charges);

    }
    public static void outputtingTotals(double charges) {
        //give us private(ish) variables
        double oil_change_fee = 19.99;
        double tire_rotation_fee = 10;
        double coupon_deduction = 5;

        //output to the screen.
        System.out.println("Today your charges come to: $" + charges );
        System.out.println("If you would like our yearly service it will be: $" + df.format((charges + yearlyService())));
        System.out.println("If you would like to add an oil change: $" + df.format(charges + yearlyService(oil_change_fee)));
        System.out.println("If you would like to add tire rotation: $" + df.format(charges + yearlyService(oil_change_fee,tire_rotation_fee)));
        System.out.println("If you would like our coupon: $" + df.format(charges + yearlyService(oil_change_fee,tire_rotation_fee,coupon_deduction)));
    }
    //overloaded methods.
    public static double yearlyService() {
        return service_fee;
    }
    public static double yearlyService(double oil_change_fee) {
        return oil_change_fee + service_fee;
    }
    public static double yearlyService(double oil_change_fee, double tire_rotation_fee) {
        return tire_rotation_fee + oil_change_fee + service_fee;
    }
    public static double yearlyService(double oil_change_fee, double tire_rotation_fee, double coupon_deduction) {
        return (tire_rotation_fee + oil_change_fee + service_fee) - coupon_deduction;
    }
}