package todo.todo.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter @Setter
public class Todo {
    private Long id;
    private String item;
    private Boolean isDone;

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

    public Boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }
}
