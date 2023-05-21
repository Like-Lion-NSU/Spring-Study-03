package com.example.todo.Entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDateTime;


public class Todo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //식별자가 되는 아이디 순번
    private boolean isDone; //완료여부
    private String item; //할일 목록

    private LocalDateTime createDate;
    private LocalDateTime update;

    @ManyToOne
    @JsonBackReference
    //매핑할 외래키
    @JoinColumn
    private Member member;







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
    //생성자에 외래키 Builder 적용

    @Builder
    Todo(Long id, boolean isDone,String item ){
        this.id = id;
        this.isDone = isDone;
        this.item = item;
    }
}


