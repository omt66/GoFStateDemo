// MIT License
package org.omt.gofstatedemo.state;

import org.omt.gofstatedemo.TrafficLight;

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
