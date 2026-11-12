import { Link, Outlet } from "react-router-dom";

function Home(){
    return(
        <>
        < div className="bg-dark pt-1 row">
            <div className="col-4">
        <p className="text-white h4 ">Admin dashboard</p>
        </div>
        <div className="col-8 p-1 d-flex gap-3 justify-content-end">
        <Link  to="/home/employeeadd" className="text-white text-decoration-none">Add </Link>
        <Link to="/home/view" className="text-white text-decoration-none">view </Link>
        <Link to="/home/update" className="text-white text-decoration-none">update details</Link>
        <Link to="/home/delete" className="text-white text-decoration-none">delete details</Link>
        <Link to="/" className="btn btn-danger  me-2">Logout</Link>
        </div>
        </div>
<Outlet></Outlet>
        </>
    )
}
export default Home;