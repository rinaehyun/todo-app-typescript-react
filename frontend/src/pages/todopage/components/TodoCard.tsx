import {Todo} from "../../../types/Todo.ts";

type TodoCardProps = {
    data: Todo
}

export default function TodoCard({data}: TodoCardProps) {

    return (
        <div >
            <h3>{data.description}</h3>
            <h4>{data.status}</h4>
        </div>
    );
}