public class FinancialForecast {

    public static double futureValue(double currentValue,
                                     double growthRate,
                                     int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        // Recursive Case
        return futureValue(currentValue,
                           growthRate,
                           years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 5;

        double result = futureValue(presentValue,
                                    growthRate,
                                    years);

        System.out.printf("Future Value after %d years = %.2f",
                          years,
                          result);
    }
}