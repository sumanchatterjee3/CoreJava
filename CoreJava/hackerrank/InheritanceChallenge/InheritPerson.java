package com.suman.hackerrank;

public class InheritPerson {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    InheritPerson(String fname, String lName, int Identification){
        this.firstName = fname;
        this.lastName = lName;
        this.idNumber = Identification;
    }

    public void printPerson(){
        System.out.println("Name: "+lastName+", "+firstName+"\n IdNumber: "+idNumber);
    }
}
