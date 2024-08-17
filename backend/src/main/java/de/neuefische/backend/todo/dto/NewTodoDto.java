package de.neuefische.backend.todo.dto;


import de.neuefische.backend.todo.model.TodoStatus;

public record NewTodoDto(
        String description,
        TodoStatus status
) {
}
