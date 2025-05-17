public class ScientificCalculator {
    private double a = 0;
    private double b = 0;
    
    public void calculate(double x) {
        if (a == 0 && b != 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        if (b == 0 && a != 0) {
            System.out.println("Error: Multiplication by zero results in division by zero.");
            return;
        }
        
        double result = x / b;
        System.out.printf("%.2f / %s equals %.2f\n", x, b, result);
    }

    public void main() {
        double aValue = 10.5; // Example value for a
        double bValue = 2.3456789; // Example value for b
        calculate(aValue); // Call the method to perform the calculation
        
        // Additional operations and calculations can be added here
    }
}
