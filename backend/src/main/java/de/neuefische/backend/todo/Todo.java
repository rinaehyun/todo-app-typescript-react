package de.neuefische.backend.todo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Table(name = "todo")
@AllArgsConstructor
@Data
public class Todo {
        @Id
        @Column(name = "id", nullable = false)
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        @Column(name = "todo", nullable = false)
        private String description;

        @Column(name = "status", nullable = false)
        @Enumerated(EnumType.STRING)
        private TodoStatus status;

        public Todo() {
                // Constructor without args
        }
}
