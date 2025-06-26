package com.keyin;

public class Task {
    private final String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }

    public String toString() {
        return description + " [" + (isCompleted ? "Completed" : "Pending") + "]";
    }
}
