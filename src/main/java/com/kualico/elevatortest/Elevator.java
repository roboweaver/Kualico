package com.kualico.elevatortest;

/**
 *
 * @author robweaver
 */
public class Elevator {
    
    private int numFloors;
    private int currentFloor;
    private boolean goingUp;
    private boolean goingDown;

    /**
     *
     */
    public Elevator(){
        numFloors = 1;
        currentFloor = 0;
    }
    
    /**
     *
     * @param numFloors
     */
    public Elevator(int numFloors){
        super();
        if (numFloors > 1){
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
     * @param currentFloor the currentFloor to set
     */
    public void setCurrentFloor(int currentFloor) {
        int oldCurrentFloor = this.currentFloor;
        this.currentFloor = currentFloor;
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
        boolean oldGoingUp = this.goingUp;
        this.goingUp = goingUp;
    }

    /**
     * @return the goingDown
     */
    public boolean isGoingDown() {
        return goingDown;
    }

    /**
     * @param goingDown the goingDown to set
     */
    public void setGoingDown(boolean goingDown) {
        boolean oldGoingDown = this.goingDown;
        this.goingDown = goingDown;
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
