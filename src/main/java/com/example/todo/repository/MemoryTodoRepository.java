package com.example.todo.repository;

import com.example.todo.Dto.TodoEditRequestDto;
import com.example.todo.Dto.TodoSaveDto;
import com.example.todo.Entity.Todo;
import jakarta.persistence.Id;
import org.hibernate.sql.Delete;

import java.util.*;

public class MemoryTodoRepository implements TodoRepository{
//    private static Map<Long, Todo> store= new HashMap<>();

    private final Map<Long, Todo> todos;
    public MemoryTodoRepository() {
        this.todos = new HashMap<>();
    }

    private static long sequence = 0L;


    @Override
    public Todo saveTodo(Todo todo, String id) {
//        Long todoId = Long.parseLong(id);
//        Todo todo = new Todo(todoId, todoSaveDto.getId(), todoSaveDto.getDescription(), false);
//        todos.put(todoId, todo);

        todo.setId(++sequence);
        todos.put(todo.getId(),todo);
        return todo;
    }

    @Override
    public Todo updateDone(TodoEditRequestDto todoEditRequestDto, Long id) {
        Todo todo = todos.get(id);
        if (todo != null) {
            todo.setcreateDate(todoEditRequestDto.getIsDone());
            return todo;
        }
        return null;
    }


    @Override
    public List<Todo> findAllTodo(Long id) {
        return new ArrayList<>(todos.values());
    }


    @Override
    public Optional<Todo> findById(Long id) {
        Todo todo = todos.get(id);
        return Optional.ofNullable(todo);
    }
    @Override
    public Todo deleteTodo(Long id) {
        Todo todo = todos.remove(id);
        return todo;
    }


}