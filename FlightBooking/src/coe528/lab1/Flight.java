/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author Ayush Dave
 */
public class Flight {
    //
    //Instance Variables declared
    private int flightNumber;
    private String orgin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
    public Flight(int fN, String orgin, String destination, String dT, int cap, double oP) {
        //Constructor initializes all the instance variables
            flightNumber=fN;
            this.orgin=orgin;
            this.destination=destination;
            departureTime=dT;
            capacity=cap;
            numberOfSeatsLeft=cap;
            originalPrice=oP;
            if(orgin.equals(destination)) {             //Throws an IllegalArugmentException if the Origin and Destination are the same
            throw new IllegalArgumentException("Orgin and Destination cannot be the same");
             }
    
    }

public void setFlightNumber(int n) {
    //Sets the flight number of a flight object
    this.flightNumber=n;
}

public int getFlightNumber() {
    //returns the flight number of a flight object
    return flightNumber;
}

public void setOrgin(String orgin) {
    //Sets the origin of a flight object
    this.orgin=orgin;
}

public String getOrgin() {
    //returns the origin of a flight object
    return orgin;
}

public void setDestination(String destination) {
    //Sets the destination of a flight object
    this.destination=destination;
}

public String getDestination() {
    //returns the destination of a flight object
    return destination;
}

public void setDepartureTime(String dT) {
    //Sets the departure time of a flight object
    this.departureTime=dT;
}

public String getDepartureTime() {
    //returns the departure time of a flight object
    return departureTime;
}

public void setCapacity(int c) {
    //Sets the capacity of a flight object
    this.capacity=c;
}

public int getCapacity() {
    //returns the capacity of a flight object
    return capacity;
}

public void setNumberOfSeatsLeft(int cap) {
    //Sets the number of seats left of a flight object
    this.numberOfSeatsLeft=cap;
}

public int getNumberOfSeatsLeft() {
    //returns the number of seats left of a flight object
    return numberOfSeatsLeft;
}

public void setOriginalPrice(double oP) {
    //Sets the original price of a flight object
    this.originalPrice=oP;
}

public double getOriginalPrice() {
    //returns the original price of a flight object
    return originalPrice;
}

public boolean bookASeat() {
    //Returns true if a seat in the flight is available
    //decrements the number of seats left in the flight
    //otherwise, returns false
    if(numberOfSeatsLeft>0) {
        numberOfSeatsLeft--;
        capacity--;
    return true;
    }

    else {
    return false;
    }
}

@Override
public String toString() {
    //Returns the String representation of the flight object including
    //flight number, Origin, Destination, Departure time and Original Price
return ("Flight Number: " + flightNumber  + ", " + orgin + " to " + destination + ", Departs at "  + departureTime  + ", Original Price: $" + originalPrice);
}

}

