package todo.entity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import todo.entity.Dto.TodoEditRequestDto;
import todo.entity.Entity.Todo;
import todo.entity.repository.MemoryTodoRepository;

import java.util.List;
import java.util.Optional;

public class TodoServicelempl implements TodoService{
    private MemoryTodoRepository memoryTodoRepository;
    @Autowired
    TodoServicelempl(MemoryTodoRepository memoryTodoRepository) {
        this.memoryTodoRepository = memoryTodoRepository;
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
