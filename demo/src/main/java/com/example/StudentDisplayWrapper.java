package com.example;

public class StudentDisplayWrapper extends StudentDecorator{
    
    public StudentDisplayWrapper(StudentDisplay obj) {
        this.obj = obj;
    }

    public void lateBehavior() {
        System.out.println("----------");
        super.lateBehavior();
        System.out.println("----------");

        
    }

    public void outstandingBehavior() {
        System.out.println("\n----------");
        super.outstandingBehavior();
        System.out.println("----------");

    }

    
}
