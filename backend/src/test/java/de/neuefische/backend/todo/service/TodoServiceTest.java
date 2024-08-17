package de.neuefische.backend.todo.service;

import de.neuefische.backend.todo.repository.TodoRepository;

import static org.mockito.Mockito.mock;

class TodoServiceTest {

    TodoRepository todoRepository = mock(TodoRepository.class);

    TodoService todoService = new TodoService(todoRepository);
/*
    @Test
    void getAllCallsRepository() {
        // given
        Todo testItem = new Todo("bla", TodoStatus.OPEN);
        Mockito.when(todoRepository.getAll())
                .thenReturn(Collections.singletonList(testItem));

        // when
        List<Todo> actual = todoService.getAll();

        // then
        Assertions.assertThat(actual)
                .containsExactly(testItem);
    }
*/

}






