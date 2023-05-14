package todo.entity.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Todo {
    @Id
    @GeneratedValue()
    private Long id;
    private String test;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTest(){
        return test;
    }
    public void setTest(String test){
        this.test = test;
    }
}
