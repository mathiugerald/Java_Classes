/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author GERALD
 */
public  abstract class employee {//this class cannot be overwritten
    private final String firstName;
    public String lastName;
    //parameterized constructor
    public employee(String first,String last){
        firstName=first;
        lastName=last;
    }
    //get firts name
    public String getfirstName(){
        return firstName;
    }
    public String lastName(){
       return lastName;
    }

    @Override
    public String toString(){
        return firstName+" "+lastName;
    }
    //abstract method that must be implemented
    public abstract double earnings();


        // TODO code applicatison logic here
    }


