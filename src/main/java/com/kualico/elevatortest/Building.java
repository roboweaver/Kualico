package com.kualico.elevatortest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robweaver
 */
public class Building {
    
    private List<Elevator> elevators;
    private int numFloors = 1;

    /**
     *
     */
    public Building(){
        this.numFloors = 1;
        elevators = new ArrayList<>();
    }
    
    /**
     *
     * @param numFloors
     */
    public Building(int numFloors){
        this();
        if (numFloors > 1){
            this.numFloors = numFloors;
        }
    }

    /**
     *
     * @param numFloors
     * @param numElevators
     */
    public Building(int numFloors, int numElevators){
        this(numFloors);
        
        while(elevators.size() < numElevators)
        {
            elevators.add(new Elevator(numFloors));
        }
    }
    
    /**
     * @return the elevators
     */
    public List<Elevator> getElevators() {
        return elevators;
    }

    /**
     * @param elevators the elevators to set
     */
    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    /**
     * @return the numFloors
     */
    public int getNumFloors() {
        return numFloors;
    }

    /**
     * @param numFloors the numFloors to set
     */
    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }
}
