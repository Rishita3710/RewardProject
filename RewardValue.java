public class RewardValue {
    private double cashValue;
    private double milesValue;

    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor for initializing with cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_CONVERSION_RATE;
    }

    // Constructor for initializing with miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
        } else {
            throw new IllegalArgumentException("The second parameter should be true if miles are being provided.");
        }
    }

    // Returns the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Returns the miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Optional: Method to update values
    public void updateValues(double newCashValue) {
        this.cashValue = newCashValue;
        this.milesValue = newCashValue / MILES_TO_CASH_CONVERSION_RATE;
    }

    public void updateValues(double newMilesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = newMilesValue;
            this.cashValue = newMilesValue * MILES_TO_CASH_CONVERSION_RATE;
        } else {
            throw new IllegalArgumentException("The second parameter should be true if miles are being provided.");
        }
    }

    @Override
    public String toString() {
        return String.format("Cash Value: %.2f, Miles Value: %.2f", cashValue, milesValue);
    }
}

