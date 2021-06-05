package trafficlight.states;

import trafficlight.observer.Subject;

//TODO implement a part of the pattern here
// Class extends Subject
public abstract class State extends Subject {
    public abstract State getNextState();
    public abstract String getColor();

    public String getSting(){
        return getColor();
    }
}
