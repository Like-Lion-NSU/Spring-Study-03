package todo.todo.repository;

import todo.todo.entity.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoRepository {
    Todo save(Todo todo);
    Optional<Todo> findById(Long id);
    Optional<Todo> findByItem(String item);
    Optional<Todo> findByIsDone(Boolean isDone);

    List<Todo> findAll();
}
