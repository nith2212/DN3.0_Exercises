public class FinancialForecasting {

    // Method to calculate future value using recursion
    public static double calculateFutureValue(double currentValue, double growthRate, int periods) {
        // Base case: If no periods are left, return the current value
        if (periods == 0) {
            return currentValue;
        }

        // Recursive case: Calculate the future value for the remaining periods
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double currentValue = 1000.0; // Example current value
        double annualGrowthRate = 0.05; // Example annual growth rate (5%)
        int years = 10; // Example number of years

        double futureValue = calculateFutureValue(currentValue, annualGrowthRate, years);
        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}
