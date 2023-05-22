package todo.entity.Dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import todo.entity.Entity.Todo;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TodoSaveDto {
//    @NotNull 오류?
    private Boolean isDone;
//    @NotNull 오류?
    private  String item;

    public TodoSaveDto(String item, Boolean isDone){
        this.item = item;
        this.isDone = isDone;
    }

    public Todo toEntity(){
        return  Todo.builder().item(item).isDone(isDone).bulid();
    }
}
