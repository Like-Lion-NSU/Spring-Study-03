package todo.entity.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDateTime;

public class Todo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String item;
    private boolean isDone;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    @ManyToOne
    @JsonBackReference
    //매핑할 외래키
    @JoinColumn
    private  Member member;

    // 생성자에 @Builder 적용
    @Builder
    public Todo(Long id, String item, Boolean isDone, Member member){
        this.id=id;
        this.item=item;
        this.isDone=isDone;
        this.member=member;
    }

    public void SetIsDone(Boolean isDone) {
        this.isDone = isDone;
    }
}
