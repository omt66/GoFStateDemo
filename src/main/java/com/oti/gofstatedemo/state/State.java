// MIT License
package com.oti.gofstatedemo.state;

import com.oti.gofstatedemo.TrafficLight;

/**
 * This is our base class that represents a traffic light state.
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
    
    /**
     * Handle the state transition.
     * Needs to be implemented by the sub-classes.
     * @param trafficLight
     */
    public abstract void handle(TrafficLight trafficLight);

    @Override
    public String toString() {
        return "State: " + name;
    }
    
    
}
