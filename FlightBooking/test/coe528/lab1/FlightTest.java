/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ayush
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of testConstructor method, of class Flight.
     */
    @Test
    public void testConstructor() {
        //Tests the Flight class constructor for each parameter
        //Passes the test if each method returns the expected result
        //for each parameter
    Flight f1 = new Flight(1234,"Toronto","Vancouver","6:30am",250,752.87);     
     assertEquals(1234, f1.getFlightNumber()); 
     assertEquals("Toronto", f1.getOrgin()); 
     assertEquals("Vancouver", f1.getDestination()); 
     assertEquals("6:30am", f1.getDepartureTime()); 
     assertEquals(250, f1.getCapacity()); 
     assertEquals(752.87,f1.getOriginalPrice(),0.01);
    }
    
    @Test
    public void testInvalidConstructor() {
        //Tests the Flight class constructor for the illegalArgumentExeption
        //Test passes if the arguement is thrown when the origin and 
        //destination specified are the same
        //returns true if they are the same, otherwise returns false
        boolean Ex = false;
        try {
            Flight fl = new Flight(1234,"Toronto","Toronto","6:30am",250,752.87); 
        }
        catch(IllegalArgumentException e) {
            Ex = true;
        }
        assertTrue(Ex);
    }
    
    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        //Passes if the flight number is set properly
        System.out.println("setFlightNumber");
        int n = 1234;
        Flight f1 = new Flight(1234,"Toronto","Montreal","6:30am",250,752.87); 
        f1.setFlightNumber(n);
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        //Checks if the getFlightNumber method returns the 
        //expected result of the flight object
        System.out.println("getFlightNumber");
        Flight f1 = new Flight(1234,"Toronto","Vancouver","6:30am",250,752.87); 
        int expResult = 1234;
        int result = f1.getFlightNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrgin method, of class Flight.
     */
    @Test
    public void testSetOrgin() {
        //Passes if the origin is set properly
        System.out.println("setOrgin");
        String o = "Toronto";
        Flight f1 = new Flight(1234,"Toronto","Montreal","6:30am",250,752.87);
        f1.setOrgin(o);
    }

    /**
     * Test of getOrgin method, of class Flight.
     */
    @Test
    public void testGetOrgin() {
        //Checks if the getOrgin method returns the 
        //expected result of the flight object
        System.out.println("getOrgin");
        Flight f1 = new Flight(1234,"Toronto","Montreal","6:30am",250,752.87);
        String expResult = "Toronto";
        String result = f1.getOrgin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        //Passes if the destination is set properly
        System.out.println("setDestination");
        String d = "Montreal";
        Flight f1 = new Flight(1234,"Toronto","Montreal","6:30am",250,752.87);
        f1.setDestination(d);
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
         //Checks if the getDestination method returns the 
        //expected result of the flight object
        System.out.println("getDestination");
        Flight f1 = new Flight(1234,"Toronto","Montreal","6:30am",250,752.87);
        String expResult = "Montreal";
        String result = f1.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        //Passes if the departure time is set properly
        System.out.println("setDepartureTime");
        String dT = "6:30am";
        Flight f1 = new Flight(1234,"Toronto","Montreal","6:30am",250,752.87);
        f1.setDepartureTime(dT);
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        //Checks if the getDepartureTime method returns the 
        //expected result of the flight object
        System.out.println("getDepartureTime");
        Flight f1 = new Flight(1234,"Toronto","Montreal","6:30am",250,752.87);
        String expResult = "6:30am";
        String result = f1.getDepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        //Passes if the capacity is set properly
        System.out.println("setCapacity");
        int c = 250;
        Flight f1 = new Flight(1234,"Toronto","Montreal","6:30am",250,752.87);
        f1.setCapacity(c);
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        //Checks if the getCapacity method returns the 
        //expected result of the flight object
        System.out.println("getCapacity");
        Flight f1 = new Flight(1234,"Toronto","Montreal","6:30am",250,752.87);
        int expResult = 250;
        int result = f1.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        //Passes if the number of seats left is set properly
        System.out.println("setNumberOfSeatsLeft");
        int cap = 250;
        Flight f1 = new Flight(1234,"Toronto","Montreal","6:30am",250,752.87);
        f1.setNumberOfSeatsLeft(cap);
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        //Checks if the getNumberOfSeatsLeft method returns the 
        //expected result of the flight object
        System.out.println("getNumberOfSeatsLeft");
        Flight f1 = new Flight(1234,"Toronto","Montreal","6:30am",250,752.87);
        int expResult = 250;
        int result = f1.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        //Passes if the original price is set properly
        System.out.println("setOriginalPrice");
        double oP = 752.87;
        Flight f1 = new Flight(1234,"Toronto","Montreal","6:30am",250,752.87);
        f1.setOriginalPrice(oP);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
       //Checks if the getOriginalPrice method returns the 
        //expected result of the flight object
        System.out.println("getOriginalPrice");
        Flight f1 = new Flight(1234,"Toronto","Montreal","6:30am",250,752.87);
        double expResult = 752.87;
        double result = f1.getOriginalPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        //Passes if bookASeat method retuns the
        //boolean expected result
        System.out.println("bookASeat");
        Flight f1 = new Flight(1234,"Toronto","Montreal","6:30am",250,752.87);
        boolean expResult = true;
        boolean result = f1.bookASeat();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        //Passes the test if the toString method of the 
        //flight object returns the expected string of the flgiht object
        System.out.println("toString");
        Flight fl = new Flight(1234,"Toronto","Vancouver","6:30am",250,752.87);   
        String expected = "Flight Number: 1234, Toronto to Vancouver, Departs at 6:30am, Original Price: $752.87"; 
        String actualResult = fl.toString();  
        assertEquals(expected, actualResult); 
    }
    
}
