public class Division implements Operation {
    @Override
    public double execute(double operand1, double operand2) {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            // Handle division by zero
            System.out.println("Cannot divide by zero");
            return Double.NaN; // Return NaN for division by zero
        }
    }
}