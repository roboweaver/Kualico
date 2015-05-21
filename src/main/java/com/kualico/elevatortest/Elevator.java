package com.kualico.elevatortest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robweaver
 */
public class Elevator {

    private int numFloors;
    private int currentFloor;
    private boolean doorOpen;
    private List<Integer> stops;

    private int trips;
    private int tripFloors;

    private boolean goingUp;
    private boolean goingDown;

    private boolean occupied;

    /**
     *
     */
    public Elevator() {
        numFloors = 1;
        currentFloor = 1;
        trips = 0;
        stops = new ArrayList<>();
        goingUp = goingDown = occupied = false;
    }

    /**
     *
     * @param numFloors
     */
    public Elevator(int numFloors) {
        this();
        if (numFloors > 1) {
            this.numFloors = numFloors;
        }
    }

    /**
     * @return the currentFloor
     */
    public int getCurrentFloor() {
        return currentFloor;
    }

    /**
     *
     * @return
     */
    public boolean isDoorOpen() {
        return doorOpen;
    }

    /**
     *
     * @param doorOpen
     */
    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    /**
     * Tell us what floor we will be at on next move.
     *
     * @return
     */
    public int getNextFloor() {
        if (isGoingUp()) {
            return nextFloorUp();
        }
        if (isGoingDown()) {
            return nextFloorDown();
        }
        return currentFloor;
    }

    /**
     * @param currentFloor the currentFloor to set
     */
    public void setCurrentFloor(int currentFloor) {
        if (currentFloor < 1) {
            this.currentFloor = 1;
        } else {
            if (currentFloor <= numFloors) {
                this.currentFloor = currentFloor;
            }
        }
    }

    /**
     * @return the goingUp
     */
    public boolean isGoingUp() {
        return goingUp;
    }

    /**
     * @param goingUp the goingUp to set
     */
    public void setGoingUp(boolean goingUp) {
        this.goingUp = goingUp;
    }

    /**
     * Set the
     *
     * @return the goingDown
     */
    public boolean isGoingDown() {
        return goingDown;
    }

    /**
     * Set the value as going down
     *
     * @param goingDown the goingDown to set
     */
    public void setGoingDown(boolean goingDown) {
        this.goingDown = goingDown;
    }

    /**
     * Get the number of floors
     *
     * @return the numFloors
     */
    public int getNumFloors() {
        return numFloors;
    }

    /**
     * Set the number of floors.
     *
     * @param numFloors the numFloors to set
     */
    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    /**
     * Return which floor would be next up
     *
     * @return
     */
    private int nextFloorUp() {
        if (currentFloor < numFloors) {
            return currentFloor + 1;
        }
        return currentFloor;
    }

    /**
     * Return which floor would be next down
     *
     * @return
     */
    private int nextFloorDown() {
        if (currentFloor > 1) {
            return currentFloor - 1;
        }
        return currentFloor;
    }

    /**
     * Upward
     *
     * @return
     */
    public int upward() {
        currentFloor = nextFloorUp();
        if (currentFloor == numFloors) {
            setGoingUp(false);
        }
        if (isStop(currentFloor)) {
            setDoorOpen(true);
            removeStop(currentFloor);
        }
        setDoorOpen(isStop(currentFloor));
        return currentFloor;
    }

    /**
     * Downward
     *
     * @return
     */
    public int downward() {
        currentFloor = nextFloorDown();
        if (currentFloor == 1) {
            setGoingDown(false);
            // Assumption that we have gone up before going down :)
            this.trips++;
        }
        setDoorOpen(isStop(currentFloor));
        removeStop(currentFloor);
        return currentFloor;
    }

    /**
     *
     * @param currentFloor
     * @return
     */
    public boolean isStop(int currentFloor) {
        boolean stopFlag = getStops().contains(currentFloor);
        return stopFlag;
    }

    /**
     * @return the stops
     */
    public List<Integer> getStops() {
        return stops;
    }

    /**
     * @param stops the stops to set
     */
    public void setStops(List<Integer> stops) {
        this.stops = stops;
    }

    /**
     * Add stop
     *
     * @param floor
     */
    public void addStop(int floor) {
        stops.add(floor);
    }

    /**
     * Remove stop
     *
     * @param floor
     */
    public void removeStop(int floor) {
        if (stops.contains(floor)) {
            stops.remove(floor);
        }
    }

    /**
     * @return the trips
     */
    public int getTrips() {
        return trips;
    }

    /**
     * Returns true if we are in service
     *
     * @return
     */
    public boolean inService() {
        return this.trips < 100;
    }

    /**
     * Reset the trips after service is done
     *
     */
    public void serviceReset() {
        this.trips = 0;
    }

    /**
     * @return the tripFloors
     */
    public int getTripFloors() {
        return tripFloors;
    }

    /**
     * @return the occupied
     */
    public boolean isOccupied() {
        return stops.size() > 0;
    }

    /**
     * Will pass a given floor
     *
     * @param floor
     * @return
     */
    public boolean willPass(int floor) {
        boolean returnValue = false;
        if (getStops().contains(floor)) {
            returnValue = true;
        }
        return returnValue;
    }

    /**
     * Returns a number based on the current floor and direction as to how many
     * floors to the stop in question.
     *
     * Will return numFloors if it is not heading toward the floor in question
     *
     * Will return floor if it is stopped at floor 1.
     *
     * @param floor
     * @return
     */
    public int getTravelFloors(int floor) {
        int returnValue = getNumFloors();
        if (isGoingUp()) {
            if (getCurrentFloor() <= floor) {
                returnValue = floor - getCurrentFloor();
            }
        } else if (isGoingDown()) {
            if (getCurrentFloor() >= floor) {
                returnValue = getCurrentFloor() - floor;
            }
        }
        return returnValue;
    }

}
