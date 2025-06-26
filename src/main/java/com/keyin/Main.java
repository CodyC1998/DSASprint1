package com.keyin;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[2]; // change size as needed

        users[0] = new User("Alice");
        users[1] = new User("Bob");

        users[0].addTask("Finish assignment");
        users[0].addTask("Buy groceries");

        users[1].addTask("Walk the dog");

        users[0].markTaskAsCompleted(0);

        for (User user : users) {
            user.printTasks();
            System.out.println();
        }
    }
}