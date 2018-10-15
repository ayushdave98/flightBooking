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
public class NonMember extends Passenger {
    //Declares the instance variables
    private String name;
    private int age;
    
   public NonMember(String n, int a) {
       //Initializes the instance variables
       super(n,a);
       name=n;
       age=a;
   }
   
   @Override
   public double applyDiscount(double p) {
        //Overrides the applyDiscount Method from the Passenger Class
        //Passenger age greater than 65 results in a 10% discount
        //otherwise, no discount
        //returns the price after the appropriate discount is applied
       if(age>65)
           return (Math.round((p-(0.1*p))*100.0)/100.0);
       else
           return p;
   }
    
}
