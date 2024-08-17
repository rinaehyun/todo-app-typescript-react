package de.neuefische.backend.todo.service;

import de.neuefische.backend.todo.dto.NewTodoDto;
import de.neuefische.backend.todo.model.Todo;
import de.neuefische.backend.todo.model.TodoStatus;
import de.neuefische.backend.todo.repository.TodoRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class TodoServiceTest {

    TodoRepository todoRepository = mock(TodoRepository.class);

    TodoService todoService = new TodoService(todoRepository);


    @Test
    void retrieveAllTodosTest_whenDBHasData_thenReturnAllTodos() {
        // GIVEN
        Todo todo1 = new Todo(1, "Cleaning", TodoStatus.OPEN);
        Todo todo2 = new Todo(2, "Learning", TodoStatus.IN_PROGRESS);
        List<Todo> todos = List.of(todo1, todo2);

        when(todoRepository.findAll()).thenReturn(todos);

        // WHEN
        List<Todo> actual = todoService.retrieveAllTodos();

        // THEN
        List<Todo> expected = todos;
        verify(todoRepository, times(1)).findAll();

        assertEquals(expected, actual);
        assertThat(actual).isEqualTo(expected)
                .contains(todo1)
                .contains(todo2);
    }

    @Test
    void retrieveAllTodosTest_whenDBisEmpty_thenReturnEmptyList() {
        // GIVEN
        List<Todo> todos = new ArrayList<>();
        when(todoRepository.findAll()).thenReturn(todos);

        // WHEN
        List<Todo> actual = todoRepository.findAll();

        // THEN
        verify(todoRepository, times(1)).findAll();
        assertThat(actual).isEmpty();
    }

    @Test
    void createATodoTest_whenPayloadIsRight_thenSaveATodo() {
        // GIVEN
        NewTodoDto newTodoDto = new NewTodoDto("Jogging", TodoStatus.IN_PROGRESS);
        Todo todoToSave = new Todo(null, newTodoDto.description(), newTodoDto.status());
        when(todoRepository.save(todoToSave)).thenReturn(todoToSave);

        // WHEN
        Todo actual = todoService.saveNewTodo(newTodoDto);

        // THEN
        Todo expected = new Todo(null, newTodoDto.description(), newTodoDto.status());
        verify(todoRepository, times(1)).save(todoToSave);
        assertEquals(expected, actual);
    }
}






