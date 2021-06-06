package trafficlight.gui;

import trafficlight.observer.Observer;

import java.awt.*;

//TODO:
// The update () method is implemented in ConcreteObserver
public class TrafficLight extends Light implements Observer {
    //TODO: CHANGE TO PUBLIC
    // to be used in TrafficLightCtrlTest
    public TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    //TODO implement a part of the pattern here
    // Observer receives notification and is processing accordingly
    // Implement the response method
    @Override
    public void update() {
        // update colors (isOn = false --> see Class Light)
        turnOn(!isOn);
    }
}

