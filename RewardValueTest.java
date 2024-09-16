public class RewardValueTest {
        public static void main(String[] args) {
            // Testing RewardValue with cash value
            RewardValue rewardCash = new RewardValue(100.00); // 100 dollars in cash
            System.out.println("Testing RewardValue with cash:");
            System.out.println("Cash Value: " + rewardCash.getCashValue());
            System.out.println("Miles Value: " + rewardCash.getMilesValue());

            // Testing RewardValue with miles value
            RewardValue rewardMiles = new RewardValue(20000, true); // 20,000 miles
            System.out.println("Testing RewardValue with miles:");
            System.out.println("Cash Value: " + rewardMiles.getCashValue());
            System.out.println("Miles Value: " + rewardMiles.getMilesValue());

            // Update values and test
            rewardCash.updateValues(150.00); // Update to 150 dollars
            System.out.println("Updated RewardValue with cash:");
            System.out.println("Cash Value: " + rewardCash.getCashValue());
            System.out.println("Miles Value: " + rewardCash.getMilesValue());

            rewardMiles.updateValues(30000, true); // Update to 30,000 miles
            System.out.println("Updated RewardValue with miles:");
            System.out.println("Cash Value: " + rewardMiles.getCashValue());
            System.out.println("Miles Value: " + rewardMiles.getMilesValue());
        }
    }

