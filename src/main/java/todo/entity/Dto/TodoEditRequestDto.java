package todo.entity.Dto;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class TodoEditRequestDto {
    @NotNull
    private Boolean isDone;

    public TodoEditRequestDto(Boolean isDone){
        this.isDone=isDone;
    }
}
