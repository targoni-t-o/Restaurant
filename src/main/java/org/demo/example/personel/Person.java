package org.demo.example.personel;

public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFulName(){
        return this.lastName + " " + this.firstName;
    }
}
