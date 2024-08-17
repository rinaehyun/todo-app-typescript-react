package de.neuefische.backend;

import de.neuefische.backend.todo.model.Todo;
import de.neuefische.backend.todo.model.TodoStatus;
import de.neuefische.backend.todo.repository.TodoRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
class TodoIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private TodoRepository todoRepository;


    @DirtiesContext
    @Test
    void getAllTodosTest_whenRepoIsEmpty_thenReturnEmptyList() throws Exception {
        // GIVEN

        // WHEN
        mockMvc.perform(get("/api/todo"))
                // THEN
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }


    /*
    @DirtiesContext
    @Test
    @Transactional
    void getAllTodosTest_whenRepoHasTodos_thenReturnAllTodos() {
        // GIVEN
        todoRepository.save(new Todo(1, "Cleaning", TodoStatus.OPEN));
        todoRepository.save(new Todo(2, "Cooking", TodoStatus.DONE));

        // WHEN
        try{
            mockMvc.perform(get("/api/todo"))
                    // THEN
                    .andExpect(status().isOk())
                    .andExpect(content().json("""
                        [
                            {
                              "id": 1,
                              "description": "Cleaning",
                              "status": "OPEN"
                            },
                            {
                              "id": 2,
                              "description": "Cooking",
                              "status": "DONE"
                            }
                        ]
                    """));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     */
}











