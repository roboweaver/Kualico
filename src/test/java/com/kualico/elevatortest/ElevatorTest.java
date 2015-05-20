package com.kualico.elevatortest;

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
        Elevator instance = new Elevator();
        int expResult = 0;
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
        Elevator instance = new Elevator();
        instance.setCurrentFloor(currentFloor);
       
    }

    /**
     * Test of isGoingUp method, of class Elevator.
     */
    @Test
    public void testIsGoingUp() {
        System.out.println("isGoingUp");
        Elevator instance = new Elevator();
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
        Elevator instance = new Elevator();
        instance.setGoingUp(goingUp);
        
    }

    /**
     * Test of isGoingDown method, of class Elevator.
     */
    @Test
    public void testIsGoingDown() {
        System.out.println("isGoingDown");
        Elevator instance = new Elevator();
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
        Elevator instance = new Elevator();
        instance.setGoingDown(goingDown);
       
    }
    
}
