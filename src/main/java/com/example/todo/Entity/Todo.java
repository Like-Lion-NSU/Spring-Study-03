package com.example.todo.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
public class Todo {
    @Id
    @GeneratedValue()
    private Long id;

    private boolean isDone;

    private String item;

    private int createDate;

    private int update;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public boolean isDone(){
        return isDone;
    }
    public void isDone(boolean isDone){
        this.isDone = isDone;
    }

    public int getcreateDate(int createDate) {return createDate;}

    public void setcreateDate() {
        this.createDate = createDate;
    }
    public int getupdate(int update) {return update;}

    public void setupdate() {
        this.update = update;
    }

}

