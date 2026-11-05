import { useState } from 'react'
import axios from "axios";

import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css';
function App() {
  
  const[name,setname]=useState("");
  const[age,setage]=useState(0);
  const [password,setpassword]=useState("");
  const [time,settime]=useState("");
  const[year,setyearofdays]=useState(0);
  const[salary,setsalary]=useState("");
  const[phone,setphone]=useState(0);

const store=async()=>{
  const employee={
    employeename:name,
    age:age,
    password:password,
    shifttime:time,
    yearofdays:year,
    salary:salary,
    phone:phone
  }
  console.log(employee.shifttime)
try {
  const response=await axios.post("http://localhost:8080/employee/addemployee",employee);
  const out= await response.data;
  alert(out);
  
} catch (error) {
  alert("backend is not connected");
}
}


 return(
  <>
<div className='container border border-primary rounded p-3 mt-2'>
  <p className='h4 text-center'>Employee form</p>
  <input className='form-control mt-2' type="text" onChange={(e)=>setname(e.target.value)} placeholder='Enter your name'></input>
  <input className='form-control mt-2' type='number' onChange={(e)=>setage(e.target.value)} placeholder='Enter your age'></input>
  <input className='form-control mt-2' type='password' onChange={(e)=>setpassword(e.target.value)} placeholder='Enter your password'></input>
  <label className='form-label mt-2 text-capitalize '>shift time</label>
  <input className='form-control mt-2' type='time' onChange={(e)=>settime(e.target.value)} placeholder='Enter your Shift time'></input>
  <input className='form-control mt-2' type='number' onChange={(e)=>setyearofdays(e.target.value)} placeholder="year of day working"></input>
  <input className='form-control mt-2' type='text' onChange={(e)=>setsalary(e.target.value)} placeholder='Enter your salary'></input>
  <input className='form-control mt-2' type='tel' onChange={(e)=>setphone(e.target.value)} placeholder='Enter your phone'></input>
  <button className='btn btn-success mt-2 w-100' onClick={store}>Add Employee</button>
</div>
  </>
 )


}

export default App
