package todo.todo.repository;

import org.springframework.stereotype.Repository;
import todo.todo.entity.Todo;

import java.util.List;
import java.util.Optional;

@Repository
public interface TodoRepository {
    Optional<Todo> findById(Long id);
    Optional<Todo> findByItem(String item);
    Optional<Todo> findByIsDone(Boolean isDone);

    List<Todo> findAll();
}
