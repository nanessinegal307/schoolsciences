public class ScientificCalculator {
    private double result;

    public ScientificCalculator() {
        this.result = 0;
    }

    public void add(double num) {
        if (num > 0) {
            result += num;
        } else if (num == 0) {
            System.out.println("Invalid operation");
        }
    }

    public void subtract(double num) {
        if (num > 0) {
            result -= num;
        } else if (num < 0) {
            result = Math.abs(result - num);
        }
    }

    public void multiply(double num) {
        if (num > 0) {
            result *= num;
        } else if (num == 0) {
            System.out.println("Invalid operation");
        }
    }

    public void divide(double num) {
        if (num != 0) {
            result /= num;
        } else if (num == 0) {
            System.out.println("Invalid operation");
        }
    }
}
