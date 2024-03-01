public class CalculatorCommand {
    private Operation operation;
    private double operand1;
    private double operand2;
    private Calculator calculator;

    public CalculatorCommand(Operation operation, double operand1, double operand2, Calculator calculator) {
        this.operation = operation;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.calculator = calculator;
    }

    public double execute() {
        return calculator.calculate(operand1, operand2, operation);
    }
}