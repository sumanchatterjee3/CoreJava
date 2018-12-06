package com.suman.hackerrank;

public class Person {
    int age;

    public Person(int initialAge) {
        if (initialAge >= 0) {
            this.age = initialAge;
        } else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }

    }

    public void yearPasses() {
        this.age += 1;
    }

    public void amIOld() {
        if (age < 13) {
            System.err.print("You are young.");
        } else if (age >= 13 && age < 18) {
            System.err.print("You are a teenager.");
        } else {
            System.err.print("You are old.");
        }
    }
}
