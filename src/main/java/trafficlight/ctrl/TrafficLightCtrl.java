package trafficlight.ctrl;

import trafficlight.gui.TrafficLight;
import trafficlight.gui.TrafficLightGui;
import trafficlight.states.State;

import java.awt.*;

//TODO: Implement Singelton-Pattern
public class TrafficLightCtrl {
    private State greenState;
    private State redState;
    private State yellowState;
    private State currentState;
    private State previousState;
    private final TrafficLightGui gui;
    private boolean doRun = true;

    //  Make Constructor private
    //  Damit es nur eine einzigartige Instanz gibt, muss eine Instanziierung durch den Client verhindert werden.
    //  Dafür wird der Konstruktur privat deklariert.
    //  Nun kann einzig der Singletoncode selbst das Singleton instanziieren.
    // Quelle: https://www.philipphauer.de/study/se/design-pattern/singleton.php
    // Field hält Referenz auf einzigartige Instanz
    private static TrafficLightCtrl instance = null;

    // Privater Konstruktur verhindert Instanziierung durch Client
    private TrafficLightCtrl() {
        super();
        initStates();
        gui = new TrafficLightGui(this);
        gui.setVisible(true);
        //TODO:
        // useful to update the current state
        currentState.notifyObserver();
    }
    //Stellt Einzigartigkeit sicher. Liefert Exemplar an Client.
    //Hier: Unsynchronisierte Lazy-Loading-Variante
    public static TrafficLightCtrl getInstance(){
        if (instance == null){
            instance = new TrafficLightCtrl();
        }
        return instance;
    }

    private void initStates() {
        greenState = new State() {
            @Override
            public State getNextState() {
                previousState = currentState;
                //TODO: useful to update the current state and the old one
                currentState.notifyObserver();  // = greenState
                yellowState.notifyObserver();   //After 1500 millis --> update to next Color
                return yellowState;
            }
            @Override
            public String getColor() {
                return "green";
            }
        };
        redState = new State() {
            @Override
            public State getNextState() {
                previousState = currentState;
                //TODO: useful to update the current state and the old one
                currentState.notifyObserver();
                yellowState.notifyObserver();

                return yellowState;
            }
            @Override
            public String getColor() {
                return "red";
            }
        };
        yellowState = new State() {
            @Override
            public State getNextState() {
                if (previousState.equals(greenState)) {
                    previousState = currentState;
                    //TODO: useful to update the current state and the old one
                    currentState.notifyObserver();
                    redState.notifyObserver();

                    return redState;
                }else {
                    previousState = currentState;
                    //TODO: useful to update the current state and the old one
                    currentState.notifyObserver();
                    greenState.notifyObserver();

                    return greenState;
                }
            }
            @Override
            public String getColor() {
                return "yellow";
            }
        };
        currentState = greenState;
        previousState = yellowState;
    }

    public State getGreenState() {
        return greenState;
    }
    public State getRedState() {
        return redState;
    }
    public State getYellowState() {
        return yellowState;
    }

    // - INFO - INFO - INFO -
    // Sleep: Causes the currently executing thread to sleep
    // (temporarily cease execution) for the specified number of milliseconds.
    public void run()  {
        int intervall = 1500;
        while (doRun) {
            try {
                Thread.sleep(intervall);
                nextState();                    //--> currentState = currentState.getNextState()
            } catch (InterruptedException e) {
                gui.showErrorMessage(e);
            }
        }
        System.out.println("Stopped");
        System.exit(0);
    }

    public void nextState() {
        currentState = currentState.getNextState();
    }
    public void stop() {
        doRun = false;
    }

    //TODO: TrafficLightCtrlTest
    // New Methode to be able to test the State Changes for Unit Tests
    public State getCurrentState(){
        return currentState;
    }
    public void setStates(State currentState, State previousState) {
        if ((TrafficLightCtrl.getInstance().greenState == currentState)
                || (currentState == yellowState && (previousState == greenState || previousState == redState))
                || ((currentState == greenState || currentState == redState) && previousState == yellowState)) {
            this.currentState = currentState;
            this.previousState = previousState;
        }
    }
}
