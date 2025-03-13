package com.example.tasktracker;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TaskUtils {
    public TaskUtils() {
    }

    public List<Task> readFromJSON(String path){
        //let's try to read all objects from a json file
        //store them in a list and return it
        ObjectMapper mapper = new ObjectMapper();
        List<Task> objects = null;
        try{
            objects = mapper.readValue(new File(path), new TypeReference<List<Task>>() {});
            objects.forEach(task -> {
                System.out.println(task.toString());});
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return objects;
    }
    public void writeToJSON(){
        return;
    }
}
