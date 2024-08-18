package de.neuefische.backend.todo.controller;

import de.neuefische.backend.todo.model.Todo;
import de.neuefische.backend.todo.service.TodoService;
import de.neuefische.backend.todo.dto.NewTodoDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
class TodoController {

    private final TodoService todoService;

    TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo")
    public List<Todo> getAllTodos() {
        return todoService.retrieveAllTodos();
    }

    @PostMapping("/todo")
    public Todo createATodo(@RequestBody NewTodoDto newTodo) {
        return todoService.saveNewTodo(newTodo);
    }

    @DeleteMapping("/todo/{id}")
    public void deleteATodo(@PathVariable Integer id) {
        todoService.deleteTodoById(id);
    }

    /*
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
    */
 }






