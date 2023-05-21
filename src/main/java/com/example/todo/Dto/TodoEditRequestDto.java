package com.example.todo.Dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class TodoEditRequestDto {

    private Boolean isDone; //완료여부

    public TodoEditRequestDto(Boolean isDone){
        this.isDone=isDone;
    }

}
