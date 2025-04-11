public class ScientificCodeExample {
    public static void main(String[] args) {
        // Example of variable declaration and initialization
        int num1 = 5;
        double pi = 3.14159;

        // Example of arithmetic operations
        System.out.println("The sum of 2 + 3 is " + (num1 + 3));
        System.out.println("The difference between 7 - 2 is " + (7 - 2));

        // Example of error handling and logging
        try {
            int a = 5;
            double b = 0;
            System.out.println("a / b: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
