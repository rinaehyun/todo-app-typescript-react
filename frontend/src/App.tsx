import './App.css'
import LoginPage from "./pages/loginpage/LoginPage.tsx";
import TodoPage from "./pages/todopage/TodoPage.tsx";
import {Route, Routes} from "react-router-dom";

function App() {

  return (
    <>
        <Routes>
            <Route path={"/"} element={<LoginPage />}></Route>
            <Route path={"/todo"} element={<TodoPage />}></Route>
        </Routes>
    </>
  )
}

export default App
