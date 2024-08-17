package de.neuefische.backend.todo.service;

import de.neuefische.backend.todo.dto.NewTodoDto;
import de.neuefische.backend.todo.model.Todo;
import de.neuefische.backend.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> retrieveAllTodos() {
        return todoRepository.findAll();
    }

    public Todo saveNewTodo(NewTodoDto newTodo) {
        Todo todoToSave = Todo.builder()
                .description(newTodo.description())
                .status(newTodo.status())
                .build();

        return todoRepository.save(todoToSave);
    }
/*
    public Todo getById(String id) {
        return todoRepository.getById(id);
    }

    public Todo update(Todo todo) {
        return todoRepository.update(todo);
    }

    public void delete(String id) {
        todoRepository.delete(id);
    }

     */
}





