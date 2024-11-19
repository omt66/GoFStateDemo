// MIT License

package org.omt.gofstatedemo;

import org.omt.gofstatedemo.state.StateGreen;

/**
 * This is a simple traffic light demo which demonstrates the 
 * GoF (Gang of Four) State pattern.
 * @author omt
 */
public class GoFStateDemo {

    public static void main(String[] args) {
        System.out.println("--- GoF State Demo ---");
        
        TrafficLight trafficLight = new TrafficLight(new StateGreen());
        
        System.out.println(trafficLight);
        
        for (int i=0;i < 10;i++) {
            System.out.println("State[" + i + "]: " + trafficLight.getState());
            trafficLight.request();
        }
        
        // Something bad happened (unfortunately!)
        trafficLight.malfunction();
        
    }
}
