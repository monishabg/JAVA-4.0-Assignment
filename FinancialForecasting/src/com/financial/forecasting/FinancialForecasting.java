package com.financial.forecasting;

public class FinancialForecasting {
    public static double calculateFutureValue(double initialAmount, double rate, int year) {
        if (year == 0) {
            return initialAmount;
        }
        return calculateFutureValue(initialAmount, rate, year - 1) * (1 + rate);
    }

    public static double calculateFutureValueMemo(double initialAmount, double rate, int year, double[] memo) {
        if (year == 0) return initialAmount;
        if (memo[year] != 0) return memo[year];

        memo[year] = calculateFutureValueMemo(initialAmount, rate, year - 1, memo) * (1 + rate);
        return memo[year];
    }

    public static void main(String[] args) {
        double initialAmount = 10000;
        double growthRate = 0.08;  
        int forecastYears = 5;

        System.out.println("🔁 Recursive Forecast (No Memoization):");
        for (int year = 0; year <= forecastYears; year++) {
            double futureValue = calculateFutureValue(initialAmount, growthRate, year);
            System.out.printf("Year %d: ₹%.2f\n", year, futureValue);
        }

        System.out.println("\n⚡ Optimized Recursive Forecast (Memoization):");
        double[] memo = new double[forecastYears + 1];
        for (int year = 0; year <= forecastYears; year++) {
            double futureValue = calculateFutureValueMemo(initialAmount, growthRate, year, memo);
            System.out.printf("Year %d: ₹%.2f\n", year, futureValue);
        }
    }
}
