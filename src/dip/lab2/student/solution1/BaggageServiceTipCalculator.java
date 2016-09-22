package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator {

    private double minBill;
    private double maxBill;
    private double goodRate;
    private double fairRate;
    private double poorRate;
    private double baseTipPerBag;
    private int bagCount;
    private double tip;
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality serviceQuality,
            int numberOfBags) {
        this.setServiceRating(serviceQuality); // perform validation
        this.setBagCount(numberOfBags);

        baseTipPerBag = 1.00; // set default value (can always be changed)
        maxBill = 100.00; // set maximum amount for bill (can always be changed)
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
                calculation = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                calculation = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                calculation = baseTipPerBag * bagCount * (1 + poorRate);
                break;
        }

        setTip(calculation);
    }

    public final void setServiceRating(ServiceQuality serviceQuality) {
        // No need to validate because enums provide type safety!
        this.serviceQuality = serviceQuality;
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        //needs validation
        if (bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        //needs validation
        if (baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    public final double getMinBill() {
        return minBill;
    }

    public final void setMinBill(double minBill) {
        //needs validation
        if (minBill < 0) {
            throw new IllegalArgumentException(
                    "error: miminum bill must be greater than or equal to zero");
        }
        this.minBill = minBill;
    }

    public final double getMaxBill() {
        
        return maxBill;
    }

    public final void setMaxBill(double maxBill) {
        //needs validation
        if (minBill < 0) {
            throw new IllegalArgumentException(
                    "error: maximum bill must be greater than or equal to zero");
        }
        this.maxBill = maxBill;
    }

    public final double getGoodRate() {
        return goodRate;
    }

    public final void setGoodRate(double goodRate) {
        //needs validation
        if (minBill < 0) {
            throw new IllegalArgumentException(
                    "error: rate must be greater than or equal to zero");
        }
        this.goodRate = goodRate;
    }

    public final double getFairRate() {
        return fairRate;
    }

    public final void setFairRate(double fairRate) {
        //needs validation
        if (minBill < 0) {
            throw new IllegalArgumentException(
                    "error: rate must be greater than or equal to zero");
        }
        this.fairRate = fairRate;
    }

    public final double getPoorRate() {
        return poorRate;
    }

    public final void setPoorRate(double poorRate) {
        //needs validation
        if (minBill < 0) {
            throw new IllegalArgumentException(
                    "error: rate must be greater than or equal to zero");
        }
        this.poorRate = poorRate;
    }

}
