
package com.company;

public class Main {

    public static void main(String[] args) {
        Person vitya = new Person();
        vitya.say("George");
        System.out.print(vitya.height);
        Person katja = new Person(123, "Vitja");
        System.out.print(katja.name + "'s height is:" + katja.height);
        //add something to check GitHub
        int GitVar = 1;
        Person alex = new Person("Alex");
        System.out.print(alex.name);
        System.out.println(GitVar);
        String TestingVariable = "GitUpload";

        System.out.println("");
        Student freshmeat = new Student();
        System.out.println(freshmeat.name);
        System.out.println(freshmeat.course);

        Student mentee = new Student(210,"Pedro", 2);
        mentee.tell();

        Student lexik = new Student(171,"LExik", 1);
        lexik.tell();
    }
}

