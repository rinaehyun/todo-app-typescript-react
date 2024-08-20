import {Todo} from "../../../types/Todo.ts";
import TodoCard from "./TodoCard.tsx";

type TodoGalleryProps = {
    data: Todo[]
}

export default function TodoGallery({data}: Readonly<TodoGalleryProps>) {

   console.log(data)
    return (
        <>
            {data.map((todo: Todo) => {
                return <TodoCard data={todo} />
            })}
        </>
    );
}