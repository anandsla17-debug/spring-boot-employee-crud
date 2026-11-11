
import {BrowserRouter,Routes,Route} from "react-router-dom";
import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css';
import Employeeadd from "./Employee/Employeeadd";
import AdminRegister from "./Admin/AdminRegister";
import Adminlogin from "./Admin/AdminLogin";
import Home from "./Admin/Home";
import Employeeviewall from "./Employee/Employeeviewall";
function App() {
  
  return(
    <BrowserRouter>
    <Routes>
      <Route path="/Register" element={<AdminRegister></AdminRegister>}></Route>
      <Route path="/" element={<Adminlogin></Adminlogin>}></Route>
    
      <Route path="/home" element={<Home></Home>}>
        <Route path="employeeadd" element={<Employeeadd></Employeeadd>}></Route>
        <Route path="view" element={<Employeeviewall></Employeeviewall>}></Route>
      </Route>
    </Routes>

    </BrowserRouter>
  )



}

export default App
