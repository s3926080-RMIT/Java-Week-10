package com.example;

public class StudentDisplayVanilla implements StudentDisplay{

    @Override
    public void lateBehavior() {
        System.out.println("This student is late");
    }

    @Override
    public void outstandingBehavior() {
        System.out.println("This student is outstanding");
    }

    public void studentBehavior() {
        System.out.println("This student is outstanding");
    }
    
}
