package com.example.tasktracker;

public enum Status {
    TODO("To do"),
    IN_PROGRESS("In progress"),
    DONE("Done");

    public final String label;

    private Status(String label) {
        this.label = label;
    }
}