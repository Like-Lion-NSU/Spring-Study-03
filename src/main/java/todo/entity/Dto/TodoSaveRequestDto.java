package todo.entity.Dto;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import todo.entity.Entity.Todo;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TodoSaveRequestDto {
    @NotNull
    private Boolean isDone;
    @NotNull
    private  String item;

    public TodoSaveRequestDto(String item, Boolean isDone){
        this.item = item;
        this.isDone = isDone;
    }

    public Todo toEntity(){
        return  Todo.builder().item(item).isDone(isDone).build();
    }
}
