package todo.entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import todo.entity.Dto.TodoEditRequestDto;
import todo.entity.Dto.TodoSaveRequestDto;
import todo.entity.Entity.Todo;
import todo.entity.Service.TodoServicelemp;

import java.util.List;
import java.util.Optional;

@RestController
public class TodoController {
    private final TodoServicelemp todoService;

    @Autowired  // 생성자
    public TodoController(TodoServicelemp todoService){
        this.todoService = todoService;
    }

    @PostMapping("/todo/{id}")      // 일정 추가
    public Long saveTodo(@PathVariable Long id, @RequestBody TodoSaveRequestDto todoSaveRequestDto){
        Long saveTodo = todoService.saveTodo(id,todoSaveRequestDto);
        return saveTodo;
    }

    @GetMapping("/todos/{id}")      // 일정 가져오기
    public List<Todo> findTodos(@PathVariable Long id){
        List<Todo> todos = todoService.findTodos(id);
        return todos;
    }

    @GetMapping("/todo/{id}")       //
    public Optional<Todo> todo(@PathVariable Long id){
        Optional<Todo> todo = todoService.findById(id);
        return todo;
    }

    @PatchMapping("/todo/{id}")     // 일정수정
    public void editTodo(@PathVariable Long id, @RequestBody TodoEditRequestDto todoEditRequestDto){
        todoService.editTodo(id, todoEditRequestDto);
    }

    @DeleteMapping("/todo/{id}")        // 일정 삭제
    public void deleteTodo(@PathVariable Long id){
        todoService.deleteTodo(id);
    }
}
