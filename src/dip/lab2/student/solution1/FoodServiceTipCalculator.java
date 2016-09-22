package dip.lab2.student.solution1;



/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator {

    private double minBill;
    private final String BILL_ENTRY_ERR
            = "Error: bill must be greater than or equal to " + minBill;
    private double goodRate;
    private double fairRate;
    private double poorRate;
    private double billAmount;
    private double tip;
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality serviceQuality, 
            double billAmount) {
        this.setServiceRating(serviceQuality);
        this.setBillAmount(billAmount);
        minBill = 0.00; // set minimum amount for bill (can always be changed)
        goodRate = 0.20; // set default value (can always be changed)
        fairRate = 0.15; // set default value (can always be changed)
        poorRate = 0.10; // set default value (can always be changed)
    }

    @Override
    public final double getTip() {
        return tip;
    }

    private void setTip(double tip) {
        this.tip = tip;
    }

    @Override
    public final void calculateTip() {
        double calculation = 0.00; // always initialize local variables

        switch (serviceQuality) {
            case GOOD:
                calculation = billAmount * goodRate;
                break;
            case FAIR:
                calculation = billAmount * fairRate;
                break;
            case POOR:
                calculation = billAmount * poorRate;
                break;
        }
        
        setTip(calculation);
    }

    public final void setBillAmount(double billAmt) {
        //needs validation
        if (billAmt < minBill) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        this.billAmount = billAmt;
    }

    public final void setServiceRating(ServiceQuality serviceQuality) {
        // No need to validate because enums provide type safety!
        this.serviceQuality = serviceQuality;
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final double getGoodRate() {
        return goodRate;
    }

    public final void setGoodRate(double goodRate) {
        //needs validation
        if (goodRate < 0) {
            throw new IllegalArgumentException(
                    "rate must be greater than or equal to zero");
        }
        this.goodRate = goodRate;
    }

    public final double getFairRate() {
        return fairRate;
    }

    public final void setFairRate(double fairRate) {
        //needs validation
        if (goodRate < 0) {
            throw new IllegalArgumentException(
                    "rate must be greater than or equal to zero");
        }
        this.fairRate = fairRate;
    }

    public final double getPoorRate() {
        return poorRate;
    }

    public final void setPoorRate(double poorRate) {
        //needs validation
        if (goodRate < 0) {
            throw new IllegalArgumentException(
                    "rate must be greater than or equal to zero");
        }
        this.poorRate = poorRate;
    }

    public final double getMinBill() {
        return minBill;
    }

    public final void setMinBill(double minBill) {
        //needs validation
        if (goodRate < 0) {
            throw new IllegalArgumentException(
                    "mininum bill be greater than or equal to zero");
        }
        this.minBill = minBill;
    }

}
