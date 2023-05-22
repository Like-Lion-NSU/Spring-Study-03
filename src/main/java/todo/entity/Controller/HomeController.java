package todo.entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import todo.entity.Dto.TodoSaveRequestDto;
import todo.entity.Entity.Todo;
import todo.entity.Service.TodoService;

@Controller
public class HomeController {
    private TodoService service;

    @Autowired
    HomeController(TodoServiceImp serviceImple) {
        this.serviceImple = serviceImple;
    }

    @PostMapping
    public ResponseEntity<Todo> saveTodo(@RequestBody TodoSaveRequestDto todoSaveDto, @RequestParam String id) {
        Todo todo = serviceImple.saveTodo(id);
    }

    @GetMapping("/")
}
