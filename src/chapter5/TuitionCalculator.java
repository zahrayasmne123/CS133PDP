package chapter5;

public class TuitionCalculator {
    public static void main(String[] args) {
        final double TUITION = 10000.0;
        final double INCREASE = 0.06;

        double tuition = TUITION;

        // Calculate tuition after ten years
        for (int i = 1; i <= 10; i++) {
            tuition += tuition * INCREASE;
        }

        System.out.printf("Tuition in ten years: $%.2f%n", tuition);

        // Calculate total cost of four years' worth of tuition after ten years
        double totalCost = 0.0;
        for (int i = 1; i <= 4; i++) {
            tuition += tuition * INCREASE;
            totalCost += tuition;
        }

        System.out.printf("Total cost of four years' worth of tuition after ten years: $%.2f%n", totalCost);
    }
}
