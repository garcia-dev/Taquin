package utility;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractModel implements Observable {
	private final List<Observer> observers = new ArrayList<>();

	public void addObserver(Observer observer){
		observers.add(observer);
	}

	public void removeObserver(Observer observer){
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers)
			observer.update();
	}
}
