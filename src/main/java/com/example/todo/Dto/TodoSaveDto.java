package com.example.todo.Dto;

import com.example.todo.Entity.Todo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class TodoSaveDto {
    private Boolean isDone; //완료여부
    private String item; //할일 목록

    public TodoSaveDto(Boolean isDone, String item){
        this.isDone = isDone;
        this.item = item;


    }
    //자바에서 메서드를 설정할 땐 두번째 단어 첫글자대문자 카멜케이스 적용
    public Todo toEntity(){
        return Todo.builder().item(item).isDone(isDone).build();
    }
}
