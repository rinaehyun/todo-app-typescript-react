import './TodoCard.css'
import {Todo} from "../../../types/Todo.ts";
import {Link} from "react-router-dom";

type TodoCardProps = {
    data: Todo
}

export default function TodoCard({data}: TodoCardProps) {

    return (
        <div className={"todo-card"}>
            <input
                type={"checkbox"}
            />
            <p className={"todo-desc"}>{data.description}</p>
            <div className={"todo-links"}>
                <Link to={"/todo/edit"}>Edit</Link>
                <Link to={"/todo/delete"}>Delete</Link>
            </div>
        </div>
    );
}