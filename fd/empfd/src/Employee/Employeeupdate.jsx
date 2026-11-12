import axios from "axios";
import { useState } from "react";
import { useLocation } from "react-router-dom";

function Employeeupdate(){
const location=useLocation();
const employee=location.state;

    const[id,setid]=useState(employee.empid);
       const[name,setname]=useState(employee.employeename);
      const[age,setage]=useState(employee.age);
      const [password,setpassword]=useState("");
      const [time,settime]=useState(employee.shifttime);
      const[year,setyearofdays]=useState(employee.yearofdays);
      const[salary,setsalary]=useState(employee.salary);
      const[phone,setphone]=useState(employee.phone);

      const update=async()=>{
        const employeeupdate={
 empid:id,
    employeename:name,
    age:age,
    password:password,
    shifttime:time,
    yearofdays:year,
    salary:salary,
    phone:phone
  }
try {
    const response=await axios.put("http://localhost:8080/employee/update",employeeupdate);
    const datas= await response.data;
    alert(datas);
} catch (error) {
    alert("backend is not connected")
}
      }
    return(
       <>
<div className='container border border-primary rounded p-3 mt-2' style={{width:"300px"}}>
  <p className='h4 text-center'>Employee update</p>
  <input type="number" className="form-control mt-2" value={id} onChange={(e)=>setid(e.target.value)} placeholder="Enter your emp id"></input>
  <input className='form-control mt-2' type="text" value={name} onChange={(e)=>setname(e.target.value)} placeholder='Enter your name'></input>
  <input className='form-control mt-2' type='number' value={age} onChange={(e)=>setage(e.target.value)} placeholder='Enter your age'></input>
  <input className='form-control mt-2' type='password'  onChange={(e)=>setpassword(e.target.value)} placeholder='Enter your password'></input>
  <label className='form-label mt-2 text-capitalize ' >shift time</label>
  <input className='form-control mt-2' type='time' value={time} onChange={(e)=>settime(e.target.value)} placeholder='Enter your Shift time'></input>
  <input className='form-control mt-2' type='number' value={year} onChange={(e)=>setyearofdays(e.target.value)} placeholder="year of day working"></input>
  <input className='form-control mt-2' type='text' value={salary} onChange={(e)=>setsalary(e.target.value)} placeholder='Enter your salary'></input>
  <input className='form-control mt-2' type='tel'value={phone} onChange={(e)=>setphone(e.target.value)} placeholder='Enter your phone'></input>
  <button className='btn btn-success mt-2 w-100' onClick={update} >Update Employee</button>
</div>
  </>
    )
}
export default Employeeupdate;