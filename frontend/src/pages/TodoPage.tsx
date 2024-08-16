import Header from "../components/Header.tsx";
import TodoGallery from "../components/TodoGallery.tsx";
import AddTodo from "../components/AddTodo.tsx";

export default function TodoPage() {

    return (
        <>
            <Header/>
            <TodoGallery/>
            <AddTodo/>
        </>
    )
}