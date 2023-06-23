package todo.entity.Entity;

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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String password;
    private String name;

    //todolist
    @JsonManagedReference
    @OneToMany(mappedBy = "member", orphanRemoval = true)
    private List<Todo> todoList = new ArrayList<>();
}
