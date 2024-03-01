import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage of the calculator
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
        System.out.println("Welcome to Quick Math Calculator!");

        boolean continueCalculating = true;
        while (continueCalculating) {
            System.out.println("Enter your calculation (e.g., 5 + 3):");
            String expression = scanner.nextLine();

            // Extract numbers and operator from the expression
            String[] parts = expression.split("\\s+");
            while (parts.length != 3) {
                System.out.println("Invalid expression format. Please make sure to add spaces.");
                System.out.println("Correct format: <number> <operator> <number>");
                expression = scanner.nextLine(); // Prompt user to enter correct format
                parts = expression.split("\\s+"); // Split the corrected expression
            }

            double num1 = Double.parseDouble(parts[0]);
            String operator = parts[1];
            double num2 = Double.parseDouble(parts[2]);

            double result = calculatorAdapter.calculate(expression);
            System.out.println("Result: " + result);

            // Example usage of the calculator with logging
            CalculatorLogger logger = new CalculatorLogger();
            Operation addition = new Addition();
            Operation subtraction = new Subtraction();
            Operation multiplication = new Multiplication();
            Operation division = new Division();

            Operation calculatorWithLogging;

            // Choose the operation based on the operator
            switch (operator) {
                case "+":
                    calculatorWithLogging = new CalculatorWithLogging(addition, logger);
                    break;
                case "-":
                    calculatorWithLogging = new CalculatorWithLogging(subtraction, logger);
                    break;
                case "*":
                    calculatorWithLogging = new CalculatorWithLogging(multiplication, logger);
                    break;
                case "/":
                    calculatorWithLogging = new CalculatorWithLogging(division, logger);
                    break;
                default:
                    System.out.println("Invalid operator in the expression. Using addition by default.");
                    calculatorWithLogging = new CalculatorWithLogging(addition, logger);
                    break;
            }

            double resultWithLogging = calculatorWithLogging.execute(num1, num2);
            System.out.println("Result with logging: " + resultWithLogging);

            // Example usage of the calculator with observer pattern
            CalculatorObservable observable = new CalculatorObservable();
            CalculatorObserver observer = message -> System.out.println("Observer: " + message);
            observable.addObserver(observer);

            double resultObservable = calculatorAdapter.calculate(expression);
            observable.notifyObservers("Calculation done: " + resultObservable);

            // Ask if the user wants to calculate something else
            System.out.println("Do you want to calculate something else? (yes/no)");
            String continueChoice = scanner.nextLine().toLowerCase();
            continueCalculating = continueChoice.equals("yes");
        }
        System.out.println("Thanks for using Quick Math Calculator. Goodbye!");
    }
}
