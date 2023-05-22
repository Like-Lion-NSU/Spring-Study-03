package todo.entity.Service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo.entity.Dto.TodoEditRequestDto;
import todo.entity.Dto.TodoSaveRequestDto;
import todo.entity.Entity.Todo;
import todo.entity.repository.MemoryTodoRepository;

import java.beans.Transient;
import java.util.List;
import java.util.Optional;
@Service
public class TodoServicelemp implements TodoService{
    private MemoryTodoRepository memoryTodoRepository;
    @Autowired
    TodoServicelemp(MemoryTodoRepository memoryTodoRepository) {
        this.memoryTodoRepository = memoryTodoRepository;
    }
    @Override
    public Optional<Todo> findById(Long id) {
        return memoryTodoRepository.findById(id);
    }

    @Override
    public List<Todo> findTodos(Long id) { return memoryTodoRepository.findAllTodo(id);}

    @Override
    public void editTodo(Long id, TodoEditRequestDto todoEditRequestDto) {
        memoryTodoRepository.updateDone(id, todoEditRequestDto);
    }
    @Override
    @Transactional
    public Long saveTodo(Long id, TodoSaveRequestDto todoSaveRequestDto) {
        Todo todo = todoSaveRequestDto.toEntity();
        memoryTodoRepository.saveTodo(id, todo);
        return todo.getId();
    }

    @Override
    public void deleteTodo(Long id) {
        this.memoryTodoRepository.deleteTodo(id);

    }
}
