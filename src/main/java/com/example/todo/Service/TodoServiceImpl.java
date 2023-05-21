package com.example.todo.Service;

import com.example.todo.Dto.TodoEditRequestDto;
import com.example.todo.Entity.Todo;
import com.example.todo.repository.MemoryTodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


//서비스 구현
public class TodoServiceImpl implements TodoService{

    private MemoryTodoRepository memoryTodoRepository;
    @Autowired
    TodoServiceImpl(MemoryTodoRepository memoryTodoRepository){
        this.memoryTodoRepository = memoryTodoRepository;

    }

    @Override
    public Todo saveTodo(Todo todo, String id) {
        return memoryTodoRepository.saveTodo(todo, id);
    }

    @Override
    public Optional<Todo> findById(Long id) {
        return memoryTodoRepository.findById(id);
    }
    @Override
    public List<Todo> findAllTodo(Long id) {
        return memoryTodoRepository.findAllTodo(id);
    }

    @Override
    public Todo updateDone(TodoEditRequestDto todoEditRequestDto, Long id) {
        return memoryTodoRepository.updateDone(todoEditRequestDto, id);
    }

    @Override
    public void deleteTodo(Long id) {
        this.memoryTodoRepository.deleteTodo(id);

    }
}
