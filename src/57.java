public class ScientificCalculator {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }

    public static double calculate(double a, double b) {
        switch (b) {
            case 0:
                throw new ArithmeticException("Division by zero");
            default:
                if (a > 0 && b > 0) {
                    return add(a, subtract(b, a));
                } else if (a < 0 && b > 0) {
                    return multiply(a, subtract(-b, a));
                } else if (a > 0 && b < 0) {
                    return divide(a, subtract(-b, a));
                } else if (a < 0 && b < 0) {
                    return multiply(a, add(-b, a));
                }
        }
    }

    public static void main(String[] args) {
        try {
            double result = calculate(10.5, -2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
