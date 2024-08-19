import {Link} from "react-router-dom";


export default function LoginPage() {
    return (
        <div className={"login-page"}>
            <h2>Welcome to the todo app!</h2>
            <Link to={"/todo"}>Login</Link>
        </div>
    )
}