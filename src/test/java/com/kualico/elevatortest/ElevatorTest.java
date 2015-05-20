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
}
