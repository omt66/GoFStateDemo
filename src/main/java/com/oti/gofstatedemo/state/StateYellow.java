// MIT License
package com.oti.gofstatedemo.state;

import com.oti.gofstatedemo.TrafficLight;

/**
 *
 * @author omt
 */
public class StateYellow extends State {
    
    public StateYellow() {
        super("Yellow");
    }

    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Yellow -> Red");
        trafficLight.setState(new StateRed());
    }
    
}
