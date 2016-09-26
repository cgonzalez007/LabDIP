
package dip.lab2.student.solution1;

/**
 *
 * @author cgonz
 */
public class TipManager {

    private TipCalculator tipCalculator;

    public TipManager(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }

    public double getTip() {
        return tipCalculator.calculateTip();
    }
;
}
