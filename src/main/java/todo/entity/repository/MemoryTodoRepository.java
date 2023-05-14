package todo.entity.repository;

import todo.entity.Entity.Todo;

import java.util.*;

public class MemoryTodoRepository implements TodoRepository{
    private static Map<Long, Todo> go= new HashMap<>();
    private static Long sch = 0L;

    @Override
    public Todo save(Todo todo) {
        todo.setId(++sch);
        go.put(todo.getId(), todo);
        return todo;
    }

    @Override
    public Optional<Todo> findById(Long id) {
        return Optional.ofNullable(go.get(id));
    }

    @Override
    public Optional<Todo> findByTest(String test) {
        return go.values().stream().filter(todo -> todo.getTest().equals(test)).findAny();
    }

    @Override
    public List<Todo> findAll() {
        return new ArrayList<>(go.values());
    }

    public void clearGo() {
        go.clear();
    }
}
