package org.example;

public class Task {
    private int month;

    public Task(int month) throws ArrayIndexOutOfBoundsException {
        if (month <= 0 || month > 12) {
            throw new ArrayIndexOutOfBoundsException ("Invalid month number. Please provide a value between 1 and 12.");
        }
        this.month = month;
    }

    public int getMonth() {
        return month;
    }
}
