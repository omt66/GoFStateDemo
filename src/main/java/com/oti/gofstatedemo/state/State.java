// MIT License
package com.oti.gofstatedemo.state;

import com.oti.gofstatedemo.TrafficLight;

/**
 * This is our base class that represents the traffic light states.
 * It is an abstract class that cannot be instantiated!!!
 * Also, it has an abstract method called "handle" which all the 
 * sub-classes should implement!
 * 
 * @author omt
 */
public abstract class State {
    private String name;
    
    public State(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public abstract void handle(TrafficLight trafficLight);

    @Override
    public String toString() {
        return "State: " + name;
    }
    
    
}
