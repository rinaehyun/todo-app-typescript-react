package de.neuefische.backend.todo.dto;


import de.neuefische.backend.todo.TodoStatus;

public record NewTodoDto(
        String description,
        TodoStatus status
) {
}
