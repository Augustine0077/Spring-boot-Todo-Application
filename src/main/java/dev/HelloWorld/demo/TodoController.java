package dev.HelloWorld.demo;

import dev.HelloWorld.demo.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {

    @Autowired
    TodoService todoService;

    // Simple test API
    @GetMapping("/get")
    String getTodo() {
        return "Tododo";
    }

    // Get Todo by Path Variable (BEST PRACTICE)
    // Example: GET /api/v1/todo/1
    @GetMapping("/{id}")
    ResponseEntity<Todo> getTodoById(@PathVariable long id) {
        return new ResponseEntity<>(
                todoService.getTodoById(id),
                HttpStatus.OK
        );
    }

    // Get Todo using Request Param
    // Example: GET /api/v1/todo?id=1
    @GetMapping("")
    String getByParam(@RequestParam int id) {
        return "todo with id " + id;
    }

    // Create Todo
    @PostMapping("/create")
    ResponseEntity<Todo> createUser(@RequestBody Todo todo) {
        return new ResponseEntity<>(
                todoService.createTodo(todo),
                HttpStatus.CREATED
        );
    }

    // Update Todo
    @PutMapping("/{id}")
    String updateToDoById(@PathVariable int id) {
        return "update todo with id " + id;
    }

    // Delete Todo
    @DeleteMapping("/{id}")
    String deleteToDoById(@PathVariable int id) {
        return "delete todo with id " + id;
    }
}