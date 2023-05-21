package com.example.todo.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 멤버식별
    private String password;
    private String username;
    private String userid;

    //todolist
    @JsonManagedReference
    @OneToMany(mappedBy = "member", orphanRemoval = true)
    private List<Todo> todoList = new ArrayList<>();





//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long Id) {
//        this.id = id;
//    }
//    public String getpassword() {
//        return password;
//    }
//
//    public void setpassword(String password) {
//        this.password = password;
//    }
//
//    public String getusername() {
//        return username;
//    }
//
//    public void setusername(String username) {
//        this.username = username;
//    }
//
//    public String getuserid(String userid) {return userid;}
//
//    public void setuserid() {
//        this.userid = userid;
//    }
}