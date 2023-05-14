package todo.entity.repository;

import todo.entity.Entity.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoRepository {
    Todo save(Todo todo);
    Optional<Todo> findById(Long id);
    Optional<Todo> findByTest(String test);
    List<Todo> findAll();
}
