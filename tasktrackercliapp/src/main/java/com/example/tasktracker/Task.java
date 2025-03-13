package com.example.tasktracker;

public class Task {

    private final Integer id;
    private String description;
    private Status status;
    private final String createdAt;
    private String updatedAt;

    //strong times as strings, although they'll be converted
    //and created using LocalDateTime, because
    //jackson doesn't support them by default

    public Task() {
        this.id = null;
        this.createdAt = null;
    }

    public Task(String description, Integer id, Status status, String createdAt, String updatedAt) {
        this.description = description;
        this.id = id;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
