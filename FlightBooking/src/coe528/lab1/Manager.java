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
public class Manager {
    //Declare Flight and Ticket Arrays for storage of flights and tickets
    Flight [] flightArray = new Flight[5];
    Ticket [] ticketArray = new Ticket[5];
    
    //declare instance variables of a flight object
    int flightNumber;
    String orgin;
    String destination;
    String departureTime;
    int capacity;
    int numberOfSeatsLeft;
    double originalPrice;
    
    public void createFlights() {
        //Populates the array by creating new instances of the 
        //flight object for each element in the array
        flightArray[0]=new Flight(1000,"Toronto","Montreal", "6:30am",150,120.85);
        flightArray[1]=new Flight(1001,"Toronto","Edmonton", "1:30am",55,175.34);
        flightArray[2]=new Flight(1002,"Toronto","Vancouver", "5:45pm",45,100.94);
        flightArray[3]=new Flight(1003,"Toronto","Montreal", "1:30am",1,125.61);
        flightArray[4]=new Flight(1004,"Toronto","Dallas", "12:10pm",250,675.12);
    }
    
    public void displayAvailableFlights(String origin, String destination) {
        //Loops through the flight array and displays all the flights that match
        //the specified origins and destinations whose capacity is greater than one
        //Informs the user if there are no available flights of the specified origin and destination
        int count=0;
        for(int i=0;i<flightArray.length;i++) {
            if(origin.equals(flightArray[i].getOrgin()) && destination.equals(flightArray[i].getDestination())) {
                if(flightArray[i].getCapacity()>0) {
                    System.out.println(flightArray[i].toString());
                    count++;
                }
                else if(count==0) 
                    System.out.println("There are currently no available flights for the specified orgin and destination");
            }
        }
        if(count==0) {
            System.out.println("There are currently no available flights for the specified orgin and destination");
        }
        
    }
    
    public Flight getFlight(int flightNumber) {
        //Loops through the flight array, compares the given flight number
        //with the flight number in the flight array
        //returns the flight object corresponding to the given flight number
        int pi=0;
        for(int i=0; i<flightArray.length;i++) {
            if(flightNumber==flightArray[i].getFlightNumber()) {
                pi=i;
            }
        }
        return flightArray[pi];
    }
    
    public void bookSeat(int flightNumber, Passenger p) {
        //Loops through the flight array and comapres the given flight number
        //If the flight object corresponding to the number exists
        //checks if the corresponding flight has room
        //If the seat is bookable, applies the appropriate price discount for the passenger
        //Creates a new ticket object array element with the corresponding
        //Passenger, flight and discounted price
        //otherwise, informs user, the flight is full
        for(int i=0;i<flightArray.length;i++) {
            if(flightNumber==flightArray[i].getFlightNumber()) {
                if(flightArray[i].bookASeat()==true) {
                    double s=p.applyDiscount(flightArray[i].getOriginalPrice());
                    ticketArray[i]=new Ticket(p,flightArray[i],s);
                    System.out.println(ticketArray[i].toString());
                }
                else
                    System.out.println("Sorry, " + "Flight " + flightArray[i].getFlightNumber()+ " is full");
            }
        }
        
    }
    
    public static void main (String Args[]) {
        // calls/tests all the methods to ensure every case works
        
        Manager aC= new Manager();
        Passenger p= new NonMember("Bob",66);   //non-member passenger over the age of 65
        Passenger p1= new Member("Sam",35,6);   //member passenger with a membership greater than 5 years
        Passenger p2= new NonMember("Tom",29);  //non-member passenger with the age under 65
        Passenger p3= new Member("Jared",50,3); //member passenger with a membership between 2 to 5 years
        Passenger p4= new Member("Bart",42,1);  //member passenger with a membership of 1 year
        
        aC.createFlights();     //Calls the creatFlights method
        System.out.println("Flights from Toronto to Montreal:");
        aC.displayAvailableFlights("Toronto", "Montreal");  //Displays all the available flights from Toronto to Montreal
        System.out.println("");
        aC.getFlight(1000);     //Returns the flight with the flight number 1000
        
        //Books seats for passenger p and p1
        aC.bookSeat(1001,p);
        aC.bookSeat(1003,p1);
        aC.bookSeat(1003,p2);   //Flight 1003 will be full, so passenger p2 may not select it
        System.out.println("");
        System.out.println("Flights from Toronto to Montreal:");    
        
        //Displays all the available flights from Toronto to Montreal
        aC.displayAvailableFlights("Toronto", "Montreal");  //Doesnt include Flight 1003 since it is full
        System.out.println("");
        
        //Books more seats for passengers p2, p3 and p4
        aC.bookSeat(1002,p2);
        aC.bookSeat(1004,p3);
        aC.bookSeat(1000,p4);
        System.out.println("");
        
        //Displays all the available flights from Toronto to Victoria
        aC.displayAvailableFlights("Toronto", "Victoria");  //Will not display any flights since none currently exist
        
    }
}
