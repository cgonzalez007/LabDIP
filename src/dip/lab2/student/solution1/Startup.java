package dip.lab2.student.solution1;

// An useful import if you need it.

import java.text.DecimalFormat;

// Another useful import if you need it.

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {

    public static void main(String[] args) {
//        TipCalculator tipCalculator
//                = new FoodServiceTipCalculator(ServiceQuality.FAIR, 125.25);
//
//        TipManager tipManager = new TipManager(tipCalculator);
//        System.out.println("Tip: $"+ tipManager.getTip());
//        

        TipCalculator tipCalculator
                = new BaggageServiceTipCalculator(ServiceQuality.POOR, 12);
        TipManager tipManager = new TipManager(tipCalculator);
        
        System.out.println("Tip: " + new DecimalFormat("$0.00").
                format(tipManager.getTip()));
/**
 * Can easily switch from a BaggageServiceTipCalculator to a 
 * FoodServiceTipCalculator and vice-versa. One thing to note between the two
 * is that for the FoodServiceTipCalculator object I must pass a double
 * BillAmount (total of Bill before adding tip), while for the
 * BaggageServiceTipCalculator object I must pass an int bagCount (total bags
 * carried by Worker). 
 * 
 */
    }
}
