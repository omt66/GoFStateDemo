// MIT License
package com.oti.gofstatedemo.state;

import com.oti.gofstatedemo.TrafficLight;

/**
 *
 * @author omt
 */
public class StateRed extends State {
    public StateRed() {
        super("Red");
    }

    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Red -> Green");
        trafficLight.setState(new StateGreen());
    }
}
