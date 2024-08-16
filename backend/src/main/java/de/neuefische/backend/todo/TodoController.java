package de.neuefische.backend.todo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
class TodoController {

    private final TodoService todoService;

    TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo")
    List<Todo> getAll() {
        return todoService.getAll();
    }

    @PostMapping("/todo")
    Todo postTodo(@RequestBody Todo todo) {
        return todoService.save(todo);
    }

    @GetMapping("/todo/{id}")
    Todo getTodoById(@PathVariable String id) {
        return todoService.getById(id);
    }

    @PutMapping(path = {"/todo/{id}/update", "/{id}"})
    Todo update(@PathVariable String id, @RequestBody Todo todo) {
        if (!todo.id().equals(id)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The id in the url does not match the request body's id");
        }
        return todoService.update(todo);
    }

    @DeleteMapping("/todo/{id}")
    void delete(@PathVariable String id) {
        todoService.delete(id);
    }
 }






