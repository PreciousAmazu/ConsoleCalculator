public class CalculatorLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}