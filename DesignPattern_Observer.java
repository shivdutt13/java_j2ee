package core.string.stringBuffer.stringBuilder;

/*
	In this if one object changes its state, all of its dependents are updated automatically.
 */

import java.util.Observable;
import java.util.Observer;

// Each observer has it update() method called with two arguments: this observable object and the arg argument.
class Student implements Observer {
	public void update(Observable o, Object arg) {
		System.out.println("Message board changed: " + arg);
	}
}

public class DesignPattern_Observer extends Observable {
	private String message;

	public String getMessage() {
		return message;
	}

	public void changeMessage(String message) {
		this.message = message;
		// This method defined in Observable class
		// It marks this observable object as having been changed.
		// The hasChanged() method will now return true.
		setChanged();
		// This method defined in Observable class
		// If this object has changed, as indicated by the hasChangedMethod(), then notify all of its
		//	observers and then  call the clearChanged() method to indicate that this object is no longer changed.
		notifyObservers(message);
	}

	public static void main(String[] args) {
		DesignPattern_Observer board = new DesignPattern_Observer();
		Student bob = new Student();
		Student joe = new Student();
		board.addObserver(bob);
		board.addObserver(joe);
		board.changeMessage("More Homework!");
	}
}