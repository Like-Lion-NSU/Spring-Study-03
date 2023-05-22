package todo.entity.repository;

import todo.entity.Dto.TodoEditRequestDto;
import todo.entity.Entity.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoRepository {
    Todo saveTodo(Long id, Todo todo);

    List<Todo> findAllTodo(Long id);

    Optional<Todo>findById(Long id);

    Todo updateDone(Long id, TodoEditRequestDto todoEditRequestDto);

    Todo deleteTodo(Long id);
}
