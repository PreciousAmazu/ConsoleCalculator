import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorAdapter {
    private Calculator calculator;

    public CalculatorAdapter() {
        this.calculator = Calculator.getInstance();
    }

    public double calculate(String expression) {
        // Regular expression to match operands and operator in the expression
        String regex = "(-?\\d+(\\.\\d+)?)\\s*([-+*/])\\s*(-?\\d+(\\.\\d+)?)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expression);

        if (matcher.find()) {
            // Extract operands and operator
            double operand1 = Double.parseDouble(matcher.group(1));
            String operator = matcher.group(3);
            double operand2 = Double.parseDouble(matcher.group(4));

            // Map the operator to the corresponding Operation implementation
            Operation operation = getOperation(operator);

            // Perform calculation using Calculator instance
            return calculator.calculate(operand1, operand2, operation);
        } else {
            // Handle invalid expression
            System.out.println("Invalid expression format");
            return Double.NaN; // Return NaN for invalid expressions
        }
    }

    private Operation getOperation(String operator) {
        switch (operator) {
            case "+":
                return new Addition();
            case "-":
                return new Subtraction();
            case "*":
                // Add other operations as needed
                return new Multiplication();
            case "/":
                return new Division();
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }
}
