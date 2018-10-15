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
public abstract class Passenger {
    //Declares protected instance variables used by the child classes
    // Member and NonMember
    protected String name;
    protected int age;
    
    public Passenger(String n, int a) {
        //Initializes the Instance variables
        name=n;
        age=a;
    }

    public String getName() {
        //returns the name of the passenger
        return name;
    }

    public void setName(String name) {
        //Sets the name of the passenger
        this.name = name;
    }

    public int getAge() {
        //returns the age of the passenger
        return age;
    }

    public void setAge(int age) {
        //Sets the age of the passenger
        this.age = age;
    }
    
    abstract double applyDiscount(double p);
    //Abstract method overidden by the child classes
    //Member and NonMember
    
}
