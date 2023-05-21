package com.example.todo.Service;

import com.example.todo.Dto.TodoEditRequestDto;
import com.example.todo.Dto.TodoSaveDto;
import com.example.todo.Entity.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    //CRUD
    Todo saveTodo(TodoSaveDto todoSaveDto, String id); //CREATE 회원 아이디와 같은 id를 가져와서 만들기

    public List<Todo>findAllTodo(Long id); //한사람 고유의 값을 가져와서 READ 읽어주기

    Todo saveTodo(Todo todo, String id);

    public Optional<Todo>findById(Long id); //한사람 고유의 값을 가져와서 READ 읽어주기


    Todo updateDone(TodoEditRequestDto todoEditRequestDto, Long id); //UPDATE 식별자 값으로 구분해서 완료여부 업데이트

    void deleteTodo(Long id); //식별자 값으로 Delete

}
