package com.example.todo.Controller;

import com.example.todo.Dto.TodoEditRequestDto;
import com.example.todo.Dto.TodoSaveDto;
import com.example.todo.Entity.Todo;
import com.example.todo.Service.TodoService;
import com.example.todo.Service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {

    private TodoServiceImpl serviceImple;

    //필드를 만들어준다음
    @Autowired
    HomeController(TodoServiceImpl serviceImple) {
        this.serviceImple = serviceImple;
    }

    @PostMapping
    public ResponseEntity<Todo> saveTodo(@RequestBody TodoSaveDto todoSaveDto, @RequestParam String id) {
        Todo todo = serviceImple.saveTodo(id);
}

    @GetMapping("/Todo")
    public ResponseEntity<Todo> getTodoById(@PathVariable("id") Long id) {
        Optional<Todo> todo = serviceImple.findById(id);
        return todo.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/Todo")//
    public List<Todo> getMethod(Long id) {
        List<Todo> todos = serviceImple.findAllTodo(id);
        return todos;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodoDoneStatus(
            @RequestBody TodoEditRequestDto todoEditRequestDto, @PathVariable("id") Long id) {
        Todo updatedTodo = serviceImple.updateDone(todoEditRequestDto, id);
        if (updatedTodo != null) {
            return ResponseEntity.ok(updatedTodo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

        @DeleteMapping("/Todo")
        public ResponseEntity<Todo> deleteTodoById(@PathVariable("id") Long id) {
            serviceImple.deleteTodo(id);
            return ResponseEntity.noContent().build();
        }

    }
}