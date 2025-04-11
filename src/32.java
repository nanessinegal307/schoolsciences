public class ScientificCalculator {
    public static void main(String[] args) {
        // Example operations using Java's Math and String classes

        double result = performCalculation("10 + 20 - 5 * 3 / 2");
        System.out.println("Result: " + result);
    }

    private static double performCalculation(String operation) {
        try {
            if (operation.equals("+")) return 10 + 20;
            else if (operation.equals("-")) return 10 - 20;
            else if (operation.equals("*")) return 10 * 20;
            else if (operation.equals("/")) return 10 / 20;

            throw new IllegalArgumentException("Unsupported operation: " + operation);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
