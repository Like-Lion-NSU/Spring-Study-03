package com.example.todo.entity;


import java.time.LocalDateTime;

public class Todo {

    private Long id;
    private String item;
    private boolean isDone;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

}
