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
    public Building() {
        this.numFloors = 1;
        elevators = new ArrayList<>();
        elevators.add(new Elevator(numFloors));
    }

    /**
     *
     * @param numFloors
     */
    public Building(int numFloors) {
        this();
        if (numFloors > 1) {
            this.numFloors = numFloors;
        }
    }

    /**
     *
     * @param numFloors
     * @param numElevators
     */
    public Building(int numFloors, int numElevators) {
        this(numFloors);

        while (elevators.size() < numElevators) {
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

    /**
     * Button pushed for floor
     * 
     * Find the closest elevator and add the floor as a stop.
     *
     * @param floor
     */
    public void buttonPushed(int floor) {
        // Find which elevators are on or going to the right floor
        List<Elevator> willPassList = getElevatorsForFloor(floor);
        // Find the elevator with the shortest distance
        Elevator myElevator = findClosestElevatorToFloor(willPassList, floor);
        // Add the floor as a stop
        myElevator.addStop(floor);
    }

    /**
     * Find the closest elevator from a the qualified list
     * 
     * @param willPassList
     * @param floor
     * @return 
     */
    public Elevator findClosestElevatorToFloor(List<Elevator> willPassList, int floor) {
        int floorCount = numFloors;
        // Default to the first one for now    
        Elevator myElevator = getElevators().get(0);
        // Now get the one that is the closest
        for (Elevator e : willPassList){
            if(e.getTravelFloors(floor) < floorCount){
                floorCount = e.getTravelFloors(floor);
                myElevator = e;
            }
        }
        return myElevator;
        
        
    }

    /**
     * Gets a list of elevators that are either on the floor in question
     * or will pass the floor.
     * 
     * @param floor
     * @return 
     */
    public List<Elevator> getElevatorsForFloor(int floor) {
        List<Elevator> willPassList = new ArrayList<>();
        // a button was pushed - loop through the elevator collection to
        // get the one that is closest to the button pushed that is going
        // in the right direction
        for (Elevator e : elevators) {
            if (e.getCurrentFloor() == floor) {
                willPassList.add(e);
                // break out of loop because it's on the current floor
                break;
            } else if (e.willPass(floor)) {
                // It's either going to pass or has it on
                // the stop list
                willPassList.add(e);
            }
        }
        return willPassList;
    }
}
