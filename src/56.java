public class ScientificFormulaCalculator {
    public double calculateResult(double baseValue) {
        if (baseValue <= 0) {
            throw new IllegalArgumentException("Base value must be greater than zero.");
        }
        return baseValue * baseValue;
    }

    public void displayResults(double baseValue, double exponentValue, int numberOfTerms) {
        for (int i = 1; i <= numberOfTerms; i++) {
            double result = calculateResult(baseValue);
            System.out.println("Base Value: " + baseValue + ", Power: " + exponentValue + ", Result: " + result);
            baseValue *= exponentValue;
        }
    }

    public static void main(String[] args) throws ArithmeticException {
        ScientificFormulaCalculator calculator = new ScientificFormulaCalculator();
        double baseValue = 1.0;
        double exponentValue = 2.0;
        int numberOfTerms = 5;

        try {
            System.out.println("Base Value: " + baseValue);
            System.out.println("Exponent Value: " + exponentValue);
            calculator.displayResults(baseValue, exponentValue, numberOfTerms);

            // Additional calculation example
            double result = calculateResult(2.0) * baseValue;
            System.out.println("Additional Calculation Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void displayResults(double baseValue, double exponentValue, int numberOfTerms) throws ArithmeticException {
        for (int i = 1; i <= numberOfTerms; i++) {
            if (i == 0 || i == 2 || i == 3 || i == 4) {
                System.out.println("Result: " + calculateResult(baseValue));
            }
        }
    }

    @Override
    public void displayResults(double baseValue, double exponentValue) throws ArithmeticException {
        for (int i = 1; i <= 5; i++) {
            if (i == 0 || i == 2 || i == 3 || i == 4) {
                System.out.println("Result: " + calculateResult(baseValue));
            }
        }
    }
}
