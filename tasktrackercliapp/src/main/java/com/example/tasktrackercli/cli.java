package com.example.tasktrackercli;

import com.example.tasktracker.Status;
import com.example.tasktracker.Task;
import com.example.tasktracker.TaskUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class cli {
    public static void main(String[] args) throws IOException {
        System.out.println("CLI initiated");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Create multiple Task objects
        Task task1 = new Task("Task 1", 1, Status.TODO, LocalDateTime.now().format(formatter), LocalDateTime.now().format(formatter));
        Task task2 = new Task("Task 2", 2, Status.DONE, LocalDateTime.now().format(formatter), LocalDateTime.now().format(formatter));

// Add tasks to a list
        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);

        ObjectMapper mapper = new ObjectMapper();
        try {
            // Write the list of tasks as a JSON array to data.json
            mapper.writeValue(new File("data.json"), tasks);
        } catch (IOException e) {
            e.printStackTrace();
        }

        TaskUtils taskUtils = new TaskUtils();
        taskUtils.readFromJSON("data.json");

    }
}

