
import {BrowserRouter,Routes,Route} from "react-router-dom";
import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css';
import Employeeadd from "./Employee/Employeeadd";
import AdminRegister from "./Admin/AdminRegister";
function App() {
  
  return(
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<AdminRegister></AdminRegister>}></Route>
      <Route path="/employeeadd" element={<Employeeadd></Employeeadd>}></Route>
    </Routes>

    </BrowserRouter>
  )



}

export default App
