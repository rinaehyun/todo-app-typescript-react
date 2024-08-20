import './App.css'
import LoginPage from "./pages/loginpage/LoginPage.tsx";
import TodoPage from "./pages/todopage/TodoPage.tsx";
import {Route, Routes} from "react-router-dom";
import Header from "./components/Header.tsx";

function App() {

  return (
    <>
        <Header />
        <main className={"page-body"}>
            <Routes>
                <Route path={"/"} element={<LoginPage />}></Route>
                <Route path={"/todo"} element={<TodoPage />}></Route>
            </Routes>
        </main>
    </>
  )
}

export default App
