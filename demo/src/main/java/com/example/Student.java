package com.example;

public class Student {
    boolean late;
    boolean outstanding;
    
    public Student(boolean late, boolean outstanding) {
        this.late = late;
        this.outstanding = outstanding;
    }

    public boolean isLate() {
        return late;
    }

    public void setLate(boolean late) {
        this.late = late;
    }

    public boolean isOutstanding() {
        return outstanding;
    }

    public void setOutstanding(boolean outstanding) {
        this.outstanding = outstanding;
    }

    
    
}
