package trafficlight.ctrl;

import trafficlight.ctrl.*;
import trafficlight.gui.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*; //for example for assertTrue,...

//TODO: Write Unit-Tests
public class TrafficLightCtrlTest {
    //TODO 0: Create Controller
    @Test
    @DisplayName("Create Controller")
    public void makeCTRL() {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        assertNotNull(ctrl);
    }

    //TODO 1: Change green to yellow
    @Test
    @DisplayName("Change Green to Yellow")
    public void colorChangeTest1() {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
    }

    //TODO 2: Change yellow to red
    @Test
    @DisplayName("Change yellow to red")
    public void colorChangeTest2() {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        assertNotNull(ctrl);
    }

    //TODO 3: Change red to yellow
    @Test
    @DisplayName("Change red to yellow")
    public void colorChangeTest3() {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        assertNotNull(ctrl);
    }

    //TODO 4: Change yellow to green
    @Test
    @DisplayName("Change yellow to green")
    public void colorChangeTest4() {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        assertNotNull(ctrl);
    }

}

