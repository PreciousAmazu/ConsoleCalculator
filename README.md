Java Calculator Program

Note: I did this alone after getting permission from the teacher so the readme.md is an explanation of my work.
This is a simple console-based calculator program written in Java. The program incorporates several design patterns to showcase good software engineering practices.
Features:
•	Basic arithmetic operations: addition, subtraction, multiplication, and division.
•	Logging of operations using the Decorator design pattern.
•	Observer pattern for notifying external components about calculations.
•	Command pattern for representing each operation as an object.
Design Patterns Used:
Creational Design Patterns:
1.	Singleton Pattern:
•	Ensures that a single instance of the Calculator class is used throughout the program.
2.	Factory Method Pattern:
•	Implements the Operation interface with classes like Addition, Subtraction, Multiplication, and Division to create different types of operations.
Structural Design Patterns:
1.	Decorator Pattern:
•	Enhances the basic calculator by adding logging capabilities with the CalculatorWithLogging class.
2.	Adapter Pattern:
•	Adapts input expressions to handle flexible calculations with the CalculatorAdapter class.
Behavioral Design Patterns:
1.	Observer Pattern:
•	Notifies external components (observers) about performed operations using the CalculatorObservable and CalculatorObserver interface.
2.	Command Pattern:
•	Represents each operation as an object with the CalculatorCommand class, facilitating undo operations and maintaining a history of commands.
How to Run:
1.	Ensure you have Java and an IDE (like IntelliJ IDEA) installed.
2.	Clone or download this repository.
3.	Open the project in your IDE.
4.	Run the Main class to execute the program.
Example Usage:
1.	Enter expressions like "5 + 3" when prompted.
2.	See the result of the calculation and any additional logging or observer notifications.
