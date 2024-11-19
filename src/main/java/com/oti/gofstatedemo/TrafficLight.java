// MIT License
package com.oti.gofstatedemo;

import com.oti.gofstatedemo.state.State;
import com.oti.gofstatedemo.state.StateBroken;

/**
 * This is the main context in our application.
 * It will maintain a state (current state) and will handle some requests!
 * In this state pattern demo, TrafficLight is the context.
 * @author omt
 */
public class TrafficLight {
    private State currentState;
    
    public TrafficLight(State initialState) {
        this.currentState = initialState;
//        System.out.println("Traffic light initial state is " + currentState);
    }
    
    public void request() {
        currentState.handle(this);
    }
    
    public State getState() {
        return currentState;
    }
    
    public void setState(State state) {
        this.currentState = state;
    }

    @Override
    public String toString() {
        return "Traffic light. Current state: " + currentState.getName();
    }
    
    public void malfunction() {
        System.out.println("Opps, something bad happened!!!");
        System.out.println("I need to flash the RED lights!");
        System.out.println("Current state was " + currentState + " will transition to Flashing RED lights!");
        currentState = new StateBroken();
    }
}
