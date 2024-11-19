// MIT License
package org.omt.gofstatedemo.state;

import org.omt.gofstatedemo.TrafficLight;

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
        // Do nothing! Because it is in broken state!
    }
}
