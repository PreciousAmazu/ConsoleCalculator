public class Calculator {
    private static Calculator instance;

    private Calculator() {}

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    public double calculate(double operand1, double operand2, Operation operation) {
        return operation.execute(operand1, operand2);
    }
}