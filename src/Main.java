import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Example usage of the calculator
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an expression (e.g., 5 + 3):");
        String expression = scanner.nextLine();

        double result = calculatorAdapter.calculate(expression);
        System.out.println("Result: " + result);

        // Example usage of the calculator with logging
        CalculatorLogger logger = new CalculatorLogger();
        Operation addition = new Addition();
        Operation subtraction = new Subtraction();

        Operation calculatorWithLogging = new CalculatorWithLogging(addition, logger);

        double resultWithLogging = calculatorWithLogging.execute(8, 3);
        System.out.println("Result with logging: " + resultWithLogging);

        // Example usage of the calculator with observer pattern
        CalculatorObservable observable = new CalculatorObservable();
        CalculatorObserver observer = message -> System.out.println("Observer: " + message);
        observable.addObserver(observer);

        double resultObservable = calculatorAdapter.calculate("10 * 5");
        observable.notifyObservers("Calculation done: " + resultObservable);
    }
}

