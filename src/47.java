public class ScientificCalculator {
    private double result;

    public ScientificCalculator() {
        this.result = 0.0;
    }

    public void add(double num) {
        this.result += num;
    }

    public void subtract(double num) {
        this.result -= num;
    }

    public void multiply(double num) {
        this.result *= num;
    }

    public void divide(double num) {
        if (num != 0.0) {
            this.result /= num;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
    }

    public double getFinalResult() {
        return result;
    }

    public static void main(String[] args) {
        ScientificCalculator calculator = new ScientificCalculator();
        System.out.println(calculator.add(5.0));
        System.out.println(calculator.subtract(3.0));
        System.out.println(calculator.multiply(4.0));
        try {
            System.out.println(calculator.divide(2.0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
