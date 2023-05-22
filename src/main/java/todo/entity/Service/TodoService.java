package todo.entity.Service;

import todo.entity.Dto.TodoEditRequestDto;
import todo.entity.Dto.TodoSaveRequestDto;
import todo.entity.Entity.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
   public  Long saveTodo(String id, TodoSaveRequestDto todoSaveRequestDto);
   public List<Todo> findTodos(Long id);
   public Optional<Todo> findById(Long id);
   public void editTodo(Long id, TodoEditRequestDto todoEditRequestDto);
   public void deleteTodo(Long id);
}
