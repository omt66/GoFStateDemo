// MIT License
package com.oti.gofstatedemo.state;

import com.oti.gofstatedemo.TrafficLight;

/**
 *
 * @author omt
 */
public class StateBroken extends State {

    public StateBroken() {
        super("Broken State");
    }

    @Override
    public void handle(TrafficLight trafficLight) {
        // Do nothing! Because it is in broken!!!
    }
}
