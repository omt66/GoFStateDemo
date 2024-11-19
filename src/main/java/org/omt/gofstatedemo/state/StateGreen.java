// MIT License
package org.omt.gofstatedemo.state;

import org.omt.gofstatedemo.TrafficLight;

/**
 *
 * @author omt
 */
public class StateGreen extends State {
    public StateGreen() {
        super("Green");
    }
    
    @Override
    public void handle(TrafficLight trafficLight) {
        // The state will transition to Yellow!
        System.out.println("Green -> Yellow");
        trafficLight.setState(new StateYellow());
    }
}
