public class ScientificCalculator {
    public static void main(String[] args) {
        double num1 = 5.0;
        double num2 = 3.0;
        double result;

        // Perform addition
        result = num1 + num2;
        System.out.println("The sum is: " + result);

        // Perform subtraction
        result = num1 - num2;
        System.out.println("The difference is: " + result);

        // Perform multiplication
        result = num1 * num2;
        System.out.println("The product is: " + result);

        // Perform division
        if (num2 != 0) {
            result = num1 / num2;
            System.out.println("The quotient is: " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
