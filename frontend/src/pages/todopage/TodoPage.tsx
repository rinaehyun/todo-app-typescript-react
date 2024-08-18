import TodoGallery from "./components/TodoGallery.tsx";
import AddTodo from "./components/AddTodo.tsx";
import axios from "axios";
import {useEffect, useState} from "react";
import {Todo} from "../../types/Todo.ts";

export default function TodoPage() {
    const [todos, setTodos] = useState<Todo[]>([]);

    const fetchAllTodos = (): void => {
        axios.get("/api/todo")
            .then(response => {
                console.log(response)
                setTodos(response.data)
            })
            .catch(error => alert(error));
    }

    useEffect(() => {
        fetchAllTodos();
    }, []);


    return (
        <>
            <h2>This is TodoApp main page.</h2>
            <TodoGallery data={todos}/>
            <AddTodo fetchTodos={fetchAllTodos} />
        </>
    )
}