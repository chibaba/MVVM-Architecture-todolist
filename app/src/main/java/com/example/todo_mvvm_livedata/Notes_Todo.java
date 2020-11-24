package com.example.todo_mvvm_livedata;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class  Notes_Todo {

    @PrimaryKey(autoGenerate =  true)
    private int id;

    private String title;

    private String description;

    private int priority;

    public Notes_Todo( String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
