import {ChangeEvent, FormEvent, useState} from "react";
import {NewTodo} from "../../../types/Todo.ts";
import axios from "axios";

export type FetchProps = {
    fetchTodos: () => void
}

export default function AddTodo({ fetchTodos }: FetchProps) {
    const [todo, setTodo] = useState<NewTodo>({
        description: ''
    });

    const handleChange = (event: ChangeEvent<HTMLInputElement>): void => {
        setTodo({ description: event.target.value });
    }

    const handleSubmit = (event: FormEvent<HTMLButtonElement>): void => {
        event.preventDefault();

        axios.post("/api/todo", {
            description: todo.description,
            status: "OPEN"
        })
            .then((): void => {
                fetchTodos()
                setTodo({ description: ''})
            })
            .catch(error => alert(error))

    }

    return (
        <form>
            <input
                value={todo.description}
                type={"text"}
                placeholder={"Write a new task here"}
                onChange={handleChange}
            />
            <button onClick={handleSubmit}>+</button>
        </form>
    );
}