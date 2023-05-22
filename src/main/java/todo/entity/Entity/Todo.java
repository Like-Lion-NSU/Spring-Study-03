package todo.entity.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    public Long getId(){
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

    public boolean getIsDone() {
        return isDone;
    }
    public void SetIsDone(Boolean isDone) {
        this.isDone = isDone;
    }
}
