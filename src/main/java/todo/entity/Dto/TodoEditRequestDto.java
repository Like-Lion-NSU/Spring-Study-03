package todo.entity.Dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class ToEditRequesDto {
    private Boolean isDone; //완료여부

    public TodoEditRequestDto(Boolean isDone){
        this.isDone=isDone;
    }
}
