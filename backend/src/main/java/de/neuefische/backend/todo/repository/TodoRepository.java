package de.neuefische.backend.todo.repository;

import de.neuefische.backend.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

    /*
    private final Map<String, Todo> todos = new HashMap<>(Map.of("1", new Todo("1", "Test", TodoStatus.OPEN)));

    public Todo getById(String id) {
        return todos.get(id);
    }

    public Todo update(Todo todo) {
        todos.put(todo.id(), todo);
        return todo;
    }

    public void delete(String id) {
        todos.remove(id);
    }
    */
}
