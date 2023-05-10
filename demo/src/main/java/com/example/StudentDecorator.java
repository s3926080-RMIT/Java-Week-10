package com.example;

public abstract class StudentDecorator implements StudentDisplay{
    
    StudentDisplay obj;
    
    public void lateBehavior() {
        obj.lateBehavior(); 
    }   

    public void outstandingBehavior() {
        obj.outstandingBehavior();
    }
}
