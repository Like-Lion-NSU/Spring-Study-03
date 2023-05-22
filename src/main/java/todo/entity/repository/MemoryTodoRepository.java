package todo.entity.repository;

import todo.entity.Dto.TodoEditRequestDto;
import todo.entity.Entity.Todo;

import java.util.*;

public class MemoryTodoRepository implements TodoRepository{
    private final Map<Long, Todo> todos;
    public MemoryTodoRepository() {
        this.todos = new HashMap<>();
    }

    private static long sequence = 0L;


    @Override
    public Todo saveTodo(Todo todo, String id) {
        todo.setId(++sequence);
        todos.put(todo.getId(),todo);
        return todo;
    }

    @Override
    public Todo updateDone(TodoEditRequestDto todoEditRequestDto, Long id) {
        Todo todo = todos.get(id);
        if (todo != null) {
            todo.setIsDate(todoEditRequestDto.getIsDone());
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
