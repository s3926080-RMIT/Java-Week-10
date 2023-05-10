package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Student student = new Student(true, true);
        StudentDisplay original = new StudentDisplayVanilla();
        StudentDisplay display = new StudentDisplayWrapper(original);

        if (student.isLate() && student.isOutstanding()) {
            display.lateBehavior();
            display.outstandingBehavior();
        }
        


    }
}
