package trafficlight.observer;

import java.util.ArrayList;
import java.util.List;

//TODO: Implement Class "Subject"
public class Subject {
    // Define an observer set to store all observer objects
    private List<Observer> observers = new ArrayList<>();

    //TODO: Implement add, remove, notify methods:

    // Registration method, used to add an observer to the observer set
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    // Logout method, used to delete an observer in the observer set
    public void removeObserve(Observer observer){
        observers.remove(observer);
    }

    // Declare notification method
    public void notifyObserver() {
        // Traverse the set of observers and call the response method of each observer
        for (Observer obs:observers) {
            obs.update();
        }
    }
}
