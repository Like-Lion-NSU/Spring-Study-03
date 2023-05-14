package todo.entity.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Member {
    @Id @GeneratedValue()
    private Long id;
    private String home;
    private int us;

    public Long getId() {
        return id;
    }

    public void setId(Long school) {
        this.id = id;
    }
    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
    public int getUs(int us) {return us;}

    public void setUs() {
        this.us = us;
    }
}
