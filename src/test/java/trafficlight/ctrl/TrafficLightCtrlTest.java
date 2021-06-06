package trafficlight.ctrl;

import org.junit.jupiter.api.*;
import trafficlight.gui.TrafficLight;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*; //for example for assertTrue,...

//TODO: Write Unit-Tests
public class TrafficLightCtrlTest {
    //First Method called for one time for initialization purpose
    @BeforeAll
    public static void init(){
        System.out.println("Testing Exercise 2: Traffic Lights");
    }
    //Method called for one time after testing all methods
    @AfterAll
    public static void finish(){
        System.out.println("Finished Testing Exercise 2");
    }

    //TODO                              ---- SINGELTON TESTS ----
    //TODO 1: Check if Singelton creates the same object
    @Test
    @DisplayName("Check Singelton - Create Same Object")
    public void checkSingleton(){
        //check if Singelton returns same object.
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        assertEquals(ctrl,TrafficLightCtrl.getInstance());
    }

    //TODO:                             ----- COLOR TESTS -----

    //TODO 2.1: Change Green Light to Yellow Light
    @Test
    @DisplayName("Change Color - Green to Yellow 1")
    public void checkGreenLight2(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getGreenState(), color.getYellowState());             //(State currentState, State previousState)

        //Traffic Light becomes yellow:
        assertEquals(color.getCurrentState().getNextState(), color.getYellowState());
    }
    //TODO 2.2: Change Green Light to Yellow Light After Yellow Light
    @Test
    @DisplayName("Change Color - Green to Yellow 2")
    public void checkGreenLight3(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getGreenState(), color.getYellowState());             //(State currentState, State previousState)

        assertNotEquals(color.getCurrentState().getNextState(), color.getGreenState());
    }
    //TODO 2.3: Change Green Light to Yellow Light After Yellow Light
    @Test
    @DisplayName("Change Color - Green to Yellow 3")
    public void checkGreenLight4(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getGreenState(), color.getYellowState());             //(State currentState, State previousState)

        assertNotEquals(color.getCurrentState().getNextState(), color.getRedState());
    }


    //TODO 3.1: Change Yellow Light to Red Light after Green Light
    @Test
    @DisplayName("Change Color - Yellow to Red 1")
    public void checkYellowLight2(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getYellowState(), color.getGreenState());             //(State currentState, State previousState)

        //Traffic Light becomes red:
        assertEquals(color.getCurrentState().getNextState(), color.getRedState());
    }
    //TODO 3.2: Change Yellow Light to Red Light after Green Light
    @Test
    @DisplayName("Change Color - Yellow to Red 2")
    public void checkYellowLight3(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getYellowState(), color.getGreenState());             //(State currentState, State previousState)

        assertNotEquals(color.getCurrentState().getNextState(), color.getYellowState());
    }
    //TODO 3.3: Change Yellow Light to Red Light after Green Light
    @Test
    @DisplayName("Change Color - Yellow to Red 3")
    public void checkYellowLight4(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getYellowState(), color.getGreenState());             //(State currentState, State previousState)

        assertNotEquals(color.getCurrentState().getNextState(), color.getGreenState());
    }


    //TODO 4.1: Change Red Light to Yellow Light
    @Test
    @DisplayName("Change Color - Red to Yellow 1")
    public void checkRedLight2(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getRedState(), color.getYellowState());                   //(State currentState, State previousState)

        //Traffic Light becomes yellow:
        assertEquals(color.getCurrentState().getNextState(), color.getYellowState());
    }
    //TODO 4.2: Change Red Light to Yellow Light
    @Test
    @DisplayName("Change Color - Red to Yellow 2")
    public void checkRedLight3(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getRedState(), color.getYellowState());                   //(State currentState, State previousState)

        assertNotEquals(color.getCurrentState().getNextState(), color.getRedState());
    }
    //TODO 4.3: Change Red Light to Yellow Light
    @Test
    @DisplayName("Change Color - Red to Yellow 2")
    public void checkRedLight4(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getRedState(), color.getYellowState());                   //(State currentState, State previousState)

        assertNotEquals(color.getCurrentState().getNextState(), color.getGreenState());
    }

    //TODO 5.1: Change Yellow Light to Green Light after Red Light
    @Test
    @DisplayName("Change Color - Yellow to Green 1")
    public void checkYellowLight5(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getYellowState(), color.getRedState());                   //(State currentState, State previousState)

        //Traffic Light becomes yellow:
        assertEquals(color.getCurrentState().getNextState(), color.getGreenState());
    }
    //TODO 5.2: Change Yellow Light to Green Light after Red Light
    @Test
    @DisplayName("Change Color - Yellow to Green 2")
    public void checkYellowLight6(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getYellowState(), color.getRedState());                   //(State currentState, State previousState)

        assertNotEquals(color.getCurrentState().getNextState(), color.getYellowState());
    }
    //TODO 5.3: Change Yellow Light to Green Light after Red Light
    @Test
    @DisplayName("Change Color - Yellow to Green 3")
    public void checkYellowLight7(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getYellowState(), color.getRedState());                   //(State currentState, State previousState)

        assertNotEquals(color.getCurrentState().getNextState(), color.getRedState());
    }
}
