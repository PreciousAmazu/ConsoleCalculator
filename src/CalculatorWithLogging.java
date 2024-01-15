public class CalculatorWithLogging implements Operation {
    private Operation operation;
    private Logger logger;

    public CalculatorWithLogging(Operation operation, Logger logger) {
        this.operation = operation;
        this.logger = logger;
    }

    @Override
    public double execute(double operand1, double operand2) {
        double result = operation.execute(operand1, operand2);
        logger.log("Performed operation: " + operation.getClass().getSimpleName());
        return result;
    }
}
