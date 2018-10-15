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
public class Member extends Passenger {
    //Declares instance variables
    private String name;
    private int age;
    private int yearsOfMembership;
    
   public Member(String n, int a,int yM) {
       //Initializes the instance variables
       super(n,a);
       name=n;
       age=a;
       yearsOfMembership=yM;

   }
   @Override
    public double applyDiscount(double p) {
        //Overrides the applyDiscount Method from the Passenger Class
        //Greater than 5 years of membership results in a 50% discount
        //2-5 years of membership results in a 10% discount
        //1 or less years of membership results in no discount
        //returns the price after the appropriate discount is applied
        if(yearsOfMembership>5)
            return(p-(p*0.5));
        if(yearsOfMembership>1 && yearsOfMembership<=5)
            return(p-(p*0.1));
        else
            return p;
    }
}


