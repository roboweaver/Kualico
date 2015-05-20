package com.kualico.elevatortest;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author robweaver
 */
public class ElevatorTest {

    private Elevator instance;

    /**
     *
     */
    public ElevatorTest() {
    }

    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     *
     */
    @Before
    public void setUp() {
        instance = new Elevator();
    }

    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getCurrentFloor method, of class Elevator.
     */
    @Test
    public void testGetCurrentFloor() {
        System.out.println("getCurrentFloor");
        int expResult = 1;
        int result = instance.getCurrentFloor();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCurrentFloor method, of class Elevator.
     */
    @Test
    public void testSetCurrentFloor() {
        System.out.println("setCurrentFloor");
        int currentFloor = 0;
        instance.setCurrentFloor(currentFloor);
        assertEquals(1, instance.getCurrentFloor());
    }

    /**
     * Test of isGoingUp method, of class Elevator.
     */
    @Test
    public void testIsGoingUp() {
        System.out.println("isGoingUp");
        boolean expResult = false;
        boolean result = instance.isGoingUp();
        assertEquals(expResult, result);

    }

    /**
     * Test of setGoingUp method, of class Elevator.
     */
    @Test
    public void testSetGoingUp() {
        System.out.println("setGoingUp");
        boolean goingUp = false;
        instance.setGoingUp(goingUp);

    }

    /**
     * Test of isGoingDown method, of class Elevator.
     */
    @Test
    public void testIsGoingDown() {
        System.out.println("isGoingDown");
        boolean expResult = false;
        boolean result = instance.isGoingDown();
        assertEquals(expResult, result);

    }

    /**
     * Test of setGoingDown method, of class Elevator.
     */
    @Test
    public void testSetGoingDown() {
        System.out.println("setGoingDown");
        boolean goingDown = false;
        instance.setGoingDown(goingDown);

    }

    /**
     * Test of isDoorOpen method, of class Elevator.
     */
    @Test
    public void testIsDoorOpen() {
        System.out.println("isDoorOpen");
        boolean expResult = false;
        boolean result = instance.isDoorOpen();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDoorOpen method, of class Elevator.
     */
    @Test
    public void testSetDoorOpen() {
        System.out.println("setDoorOpen");
        boolean doorOpen = false;
        instance.setDoorOpen(doorOpen);

    }

    /**
     * Test of getNextFloor method, of class Elevator.
     */
    @Test
    public void testGetNextFloor() {
        System.out.println("getNextFloor");
        int expResult = 1;
        int result = instance.getNextFloor();
        assertEquals(expResult, result);

    }

    /**
     * Test of getNumFloors method, of class Elevator.
     */
    @Test
    public void testGetNumFloors() {
        System.out.println("getNumFloors");
        int expResult = 0;
        int result = instance.getNumFloors();

    }

    /**
     * Test of setNumFloors method, of class Elevator.
     */
    @Test
    public void testSetNumFloors() {
        System.out.println("setNumFloors");
        int numFloors = 0;
        instance.setNumFloors(numFloors);

    }

    /**
     * Test of upward method, of class Elevator.
     */
    @Test
    public void testUpward() {
        System.out.println("upward");
        int expResult = 1;
        int result = instance.upward();
        assertEquals(expResult, result);

    }

    /**
     * Test of downward method, of class Elevator.
     */
    @Test
    public void testDownward() {
        System.out.println("downward");
        int expResult = 1;
        int result = instance.downward();
        assertEquals(expResult, result);

    }

    /**
     * Test of isStop method, of class Elevator.
     */
    @Test
    public void testIsStop() {
        System.out.println("isStop");
        int currentFloor = 0;
        boolean expResult = false;
        boolean result = instance.isStop(currentFloor);
        assertEquals(expResult, result);

    }

    /**
     * Test of getStops method, of class Elevator.
     */
    @Test
    public void testGetStops() {
        System.out.println("getStops");
        List<Integer> expResult = new ArrayList<>();
        List<Integer> result = instance.getStops();
        assertEquals(expResult, result);

    }

    /**
     * Test of setStops method, of class Elevator.
     */
    @Test
    public void testSetStops() {
        System.out.println("setStops");
        List<Integer> stops = null;
        instance.setStops(stops);

    }

    /**
     * Test of addStop method, of class Elevator.
     */
    @Test
    public void testAddStop() {
        System.out.println("addStop");
        int floor = 0;
        instance.addStop(floor);

    }

    /**
     * Test of removeStop method, of class Elevator.
     */
    @Test
    public void testRemoveStop() {
        System.out.println("removeStop");
        int floor = 0;
        instance.removeStop(floor);

    }

    /**
     * Test to verify going down doesn't go below 1.
     */
    @Test
    public void testBelowGround() {
        instance.setCurrentFloor(1);
        assertEquals(1, instance.getCurrentFloor());
        assertEquals(1, instance.getNextFloor());
    }

    /**
     * Test to verify that going up doesn't go above top floor
     */
    @Test
    public void testAboveTop() {
        instance.setCurrentFloor(instance.getNumFloors() + 5);
        assertEquals(instance.getNumFloors(), instance.getCurrentFloor());
        assertEquals(instance.getNumFloors(), instance.getNextFloor());
    }

    /**
     * Test of getTrips method, of class Elevator.
     */
    @Test
    public void testGetTrips() {
        System.out.println("getTrips");
        int expResult = 0;
        int result = instance.getTrips();
        assertEquals(expResult, result);

    }

    /**
     * Test of inService method, of class Elevator.
     */
    @Test
    public void testInService() {
        System.out.println("inService");
        boolean expResult = true;
        boolean result = instance.inService();
        assertEquals(expResult, result);

    }

    /**
     * Test if it gives the right answer after 100 trips
     * 
     * FIXME - need a definition of what it means to count trips and code this
     *         more intelligently.
     */
    @Test
    public void testOutOfService() {
        System.out.println("Test inService when it should be out of service");
        instance.setNumFloors(2);
        for (int i = 0; i < 100; i++) {
            instance.upward();
            instance.downward();
        }

        assertEquals(false, instance.inService());
    }

    /**
     * Test of serviceReset method, of class Elevator.
     */
    @Test
    public void testServiceReset() {
        System.out.println("serviceReset");
        instance.serviceReset();

    }

    /**
     * Test of getTripFloors method, of class Elevator.
     */
    @Test
    public void testGetTripFloors() {
        System.out.println("getTripFloors");
        int expResult = 0;
        int result = instance.getTripFloors();
        assertEquals(expResult, result);

    }

    /**
     * Test of isOccupied method, of class Elevator.
     */
    @Test
    public void testIsOccupied() {
        System.out.println("isOccupied");
        boolean expResult = false;
        boolean result = instance.isOccupied();
        assertEquals(expResult, result);

    }
}
