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


    // Check if Singelton creates/returns the same object
    @Test
    @DisplayName("Check Singelton - Create Same Object")
    public void checkSingleton(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        assertEquals(ctrl,TrafficLightCtrl.getInstance());
    }


    //Change Green Light to Yellow Light
    @Test
    @DisplayName("Change Color - Green to Yellow 1")
    public void checkGreenLight2(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getGreenState(), color.getYellowState());
        //(State currentState, State previousState)

        //Traffic Light becomes yellow:
        assertEquals(color.getCurrentState().getNextState(), color.getYellowState());
    }
    //Change Green Light to Yellow Light After Yellow Light
    @Test
    @DisplayName("Change Color - Green to Yellow 2")
    public void checkGreenLight3(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getGreenState(), color.getYellowState());
        //(State currentState, State previousState)

        assertNotEquals(color.getCurrentState().getNextState(), color.getGreenState());
    }
    //Change Green Light to Yellow Light After Yellow Light
    @Test
    @DisplayName("Change Color - Green to Yellow 3")
    public void checkGreenLight4(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getGreenState(), color.getYellowState());
        //(State currentState, State previousState)

        assertNotEquals(color.getCurrentState().getNextState(), color.getRedState());
    }


    //Change Yellow Light to Red Light after Green Light
    @Test
    @DisplayName("Change Color - Yellow to Red 1")
    public void checkYellowLight2(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getYellowState(), color.getGreenState());
        //(State currentState, State previousState)

        //Traffic Light becomes red:
        assertEquals(color.getCurrentState().getNextState(), color.getRedState());
    }
    //Change Yellow Light to Red Light after Green Light
    @Test
    @DisplayName("Change Color - Yellow to Red 2")
    public void checkYellowLight3(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getYellowState(), color.getGreenState());
        //(State currentState, State previousState)

        assertNotEquals(color.getCurrentState().getNextState(), color.getYellowState());
    }
    //Change Yellow Light to Red Light after Green Light
    @Test
    @DisplayName("Change Color - Yellow to Red 3")
    public void checkYellowLight4(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getYellowState(), color.getGreenState());
        //(State currentState, State previousState)

        assertNotEquals(color.getCurrentState().getNextState(), color.getGreenState());
    }


    // Change Red Light to Yellow Light
    @Test
    @DisplayName("Change Color - Red to Yellow 1")
    public void checkRedLight2(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getRedState(), color.getYellowState());
        //(State currentState, State previousState)

        //Traffic Light becomes yellow:
        assertEquals(color.getCurrentState().getNextState(), color.getYellowState());
    }
    //Change Red Light to Yellow Light
    @Test
    @DisplayName("Change Color - Red to Yellow 2")
    public void checkRedLight3(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getRedState(), color.getYellowState());
        //(State currentState, State previousState)

        assertNotEquals(color.getCurrentState().getNextState(), color.getRedState());
    }
    //Change Red Light to Yellow Light
    @Test
    @DisplayName("Change Color - Red to Yellow 2")
    public void checkRedLight4(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getRedState(), color.getYellowState());
        //(State currentState, State previousState)

        assertNotEquals(color.getCurrentState().getNextState(), color.getGreenState());
    }

    //Change Yellow Light to Green Light after Red Light
    @Test
    @DisplayName("Change Color - Yellow to Green 1")
    public void checkYellowLight5(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getYellowState(), color.getRedState());
        //(State currentState, State previousState)

        //Traffic Light becomes yellow:
        assertEquals(color.getCurrentState().getNextState(), color.getGreenState());
    }
    //Change Yellow Light to Green Light after Red Light
    @Test
    @DisplayName("Change Color - Yellow to Green 2")
    public void checkYellowLight6(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getYellowState(), color.getRedState());
        //(State currentState, State previousState)
        assertNotEquals(color.getCurrentState().getNextState(), color.getYellowState());
    }
    //Change Yellow Light to Green Light after Red Light
    @Test
    @DisplayName("Change Color - Yellow to Green 3")
    public void checkYellowLight7(){
        TrafficLightCtrl color = TrafficLightCtrl.getInstance();
        color.setStates(color.getYellowState(), color.getRedState());
        //(State currentState, State previousState)
        assertNotEquals(color.getCurrentState().getNextState(), color.getRedState());
    }
}
