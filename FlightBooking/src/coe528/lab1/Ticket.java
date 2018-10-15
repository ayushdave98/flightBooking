/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author ayush
 */
public class Ticket {
    //Declares instance variables
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int number;
    
    public Ticket(Passenger p, Flight flight, double price) {
        //Initializes instance variables
        passenger=p;
        this.flight=flight;
        this.price=price;
        this.number=0;
    }

    public Passenger getPassenger() {
        //returns the passenger of the ticket object
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        //Sets the passenger of the ticket object
        this.passenger = passenger;
    }

    public Flight getFlight() {
        //returns the flight of the ticket object
        return flight;
    }

    public void setFlight(Flight flight) {
        //Sets the flight of the ticket object
        this.flight = flight;
    }

    public double getPrice() {
        //returns the orignal price of the ticket object
        return price;
    }

    public void setPrice(double price) {
        //Sets the original price of the ticket object
        this.price = price;
    }

    public static int getNumber() {
        //returns the ticket number of the ticket object
        return number;
    }

    public static void setNumber(int number) {
        //Sets the ticket number of the ticket object
        Ticket.number = number;
    }
    
@Override
public String toString() {
    //Returns the String representation of the ticket object including
    //Passenger Name, flight number, Origin, Destination, Departure time, Original Price and Actual Price
return ("Passenger Name: " + passenger.getName() + ", " + flight.toString()+ ", Actual Ticket Price: " + price);
}
}
