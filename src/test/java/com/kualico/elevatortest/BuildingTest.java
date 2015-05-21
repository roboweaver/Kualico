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
public class BuildingTest {
    private Building instance;

    /**
     *
     */
    public BuildingTest() {
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
        instance = new Building(1);
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getElevators method, of class Building.
     */
    @Test
    public void testGetElevators() {
        System.out.println("getElevators");
        List<Elevator> expResult = new ArrayList<>();
        expResult.add(new Elevator());
        List<Elevator> result = instance.getElevators();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setElevators method, of class Building.
     */
    @Test
    public void testSetElevators() {
        System.out.println("setElevators");
        List<Elevator> elevators = null;
        instance.setElevators(elevators);
       
    }


    /**
     * Test of getNumFloors method, of class Building.
     */
    @Test
    public void testGetNumFloors() {
        System.out.println("getNumFloors");
        int expResult = 1;
        int result = instance.getNumFloors();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumFloors method, of class Building.
     */
    @Test
    public void testSetNumFloors() {
        System.out.println("setNumFloors");
        int numFloors = 0;
        instance.setNumFloors(numFloors);
    
    }

    /**
     * Test of buttonPushed method, of class Building.
     */
    @Test
    public void testButtonPushed() {
        System.out.println("buttonPushed");
        int floor = 0;
        instance.buttonPushed(floor);
    }

    /**
     * Test of findClosestElevatorToFloor method, of class Building.
     */
    @Test
    public void testFindClosestElevatorToFloor() {
        System.out.println("findClosestElevatorToFloor");
        List<Elevator> willPassList = null;
        int floor = 0;
        Elevator expResult = null;
        Elevator result = instance.findClosestElevatorToFloor(willPassList, floor);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getElevatorsForFloor method, of class Building.
     */
    @Test
    public void testGetElevatorsForFloor() {
        System.out.println("getElevatorsForFloor");
        int floor = 0;
        List<Elevator> expResult = null;
        List<Elevator> result = instance.getElevatorsForFloor(floor);
        assertEquals(expResult, result);
        
    }
    
}
