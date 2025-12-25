package de.dhbw.ravensburg;

public class FlashTrader {

    public static void main(String[] args) {
        double[] stockPrices = {150.50, 165.00, 140.00, 130.00, 175.00, 190.00, 150.00, 210.00, 110.00, 105.00};

        System.out.println("--- Market Analysis Report ---");
        analyzePatterns(stockPrices);

        double maxProfit = calculateMaxProfit(stockPrices);
        System.out.println("\nMaximum Possible Profit: $" + maxProfit);
    }

    public static void analyzePatterns(double[] p) {
        // TODO: Aufgabe 6 implementieren
    }

    public static double calculateMaxProfit(double[] p) {
        // TODO: Aufgabe 6 implementieren
        return 0.0; // Platzhalter-Rückgabewert
    }

}
