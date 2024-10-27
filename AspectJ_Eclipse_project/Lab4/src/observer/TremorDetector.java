

package observer;

import java.util.*;

//TremorDetector Class (acts as Subject)
public class TremorDetector implements Subject {
@SuppressWarnings("unused")
private List<Observer> observers;
private boolean tremorDetected;

public TremorDetector() {
   observers = new ArrayList<>();
}
public void registerObserver(Observer observer) { /* No functionality here */ }
public void removeObserver(Observer observer) { /* No functionality here */ }
public void notifyObservers() { /* No functionality here */ }
public boolean isTremorDetected() { return tremorDetected; }
}
