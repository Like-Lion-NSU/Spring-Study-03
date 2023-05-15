package com.example.todo.repository;

import com.example.todo.Entity.Todo;

import java.util.*;

public class MemoryTodoRepository implements TodoRepository{
    private static Map<Long, Todo> store= new HashMap<>();
    private static Long sch = 0L;

    @Override
    public Todo save(Todo todo) {
        todo.setId(++sch);
        store.put(todo.getId(), todo);
        return todo;
    }

    @Override
    public Optional<Todo> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }



    @Override
    public List<Todo> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearGo() {
        store.clear();
    }
}