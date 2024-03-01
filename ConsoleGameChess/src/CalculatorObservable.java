import java.util.ArrayList;
import java.util.List;
public class CalculatorObservable {
    private List<CalculatorObserver> observers = new ArrayList<>();

    public void addObserver(CalculatorObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (CalculatorObserver observer : observers) {
            observer.update(message);
        }
    }
}
