import './Header.css'

export default function Header() {
    return (
        <header className="navbar">
            <div className="navbar-left">
                <a href="/">Home</a>
            </div>
            <div className="navbar-center">
                 <a href="/todo">Today's todos</a>
            </div>
        </header>
    );
}
