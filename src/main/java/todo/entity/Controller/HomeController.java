package todo.entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import todo.entity.Dto.TodoEditRequestDto;
import todo.entity.Dto.TodoSaveRequestDto;
import todo.entity.Entity.Todo;
import todo.entity.Service.TodoService;
import todo.entity.Service.TodoServicelemp;

import java.util.Optional;

@Controller
@RequestMapping("/todo")
public class HomeController {
    private TodoService service;
    @Autowired
    HomeController(TodoServicelemp service) {
        this.service = service;
    }
    @PostMapping()
    public ResponseEntity<Todo> getTodo(@RequestBody TodoSaveRequestDto todoSaveDto, @RequestParam String id) {
        Todo todo = service.saveTodo(id);
    }
    @GetMapping
    public ResponseEntity<Todo> getTodoById(@PathVariable("id") Long id) {
        Optional<Todo> todo = service.findById(id);
        return todo.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodoDoneStatus(
            @PathVariable("id") Long id, @RequestBody TodoEditRequestDto todoEditRequestDto) {
        Todo editTodo = service.editTodo(id, todoEditRequestDto);
        if (editTodo != null) {
            return ResponseEntity.ok(editTodo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Todo> deleteTodoById(@PathVariable("id") Long id) {
        service.deleteTodo(id);
        return ResponseEntity.noContent().build();
    }
}
