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
    
}
