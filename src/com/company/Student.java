package com.company;

//inheritance - Nasledovanie
public class Student extends Person {
    int course = 1;

    void tell () {
        System.out.println(super.name);
        //add super to get data from Person class
    }
}
