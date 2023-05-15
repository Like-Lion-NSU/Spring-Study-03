package com.example.todo.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Member {
    @Id @GeneratedValue()
    private Long id;
    private String password;
    private String username;
    private int userid;

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = id;
    }
    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public int getuserid(int userid) {return userid;}

    public void setuserid() {
        this.userid = userid;
    }
}