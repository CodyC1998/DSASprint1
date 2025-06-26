package com.keyin;

public class User {
    private final String name;
    private final TaskList taskList;

    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        taskList.add(description);
    }

    public void markTaskAsCompleted(int index) {
        taskList.markCompleted(index);
    }

    public void printTasks() {
        System.out.println("Tasks for " + name + ":");
        taskList.printAll();
    }
}