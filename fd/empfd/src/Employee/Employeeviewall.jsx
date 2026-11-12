import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

function Employeeviewall(){

    const[employeeadd,setemployee]=useState([]);
const navigate=useNavigate();
   useEffect(()=>{
 const displayall=async()=>{
        try {
            const response= await axios.get("http://localhost:8080/employee/allemployee");
           const view = await response.data;
           setemployee(view);
           console.log(view)
        } catch (error) {
            alert("backend is not connected")
        }
    }
    displayall();
   },[]); 

   function deletepage(view){
navigate("/home/delete",{
    state:view
});
   }
   function updatelogic(view){
    navigate("/home/update",{
        state:view
    })
   }
    return(
        <table className="table table-primary border border-primary table-bordered mt-4 mx-2">
            <thead>
                <tr>
                    <th>emp id</th>
                    <th>emp name</th>
                    <th>emp age</th>
                    <th>emp phone</th>
                    <th>emp year of days</th>
                    <th>emp salary</th>
                    <th>emp shift time</th>
                    <th>update</th>
                    <th>delete</th>
                </tr>
            </thead>
            <tbody>
                {
                    employeeadd.map((view,index)=>(
<tr key={index}>
    <td>{view.empid}</td>
    <td>{view.employeename}</td>
    <td>{view.age}</td>
    <td>{view.phone}</td>
    <td>{view.yearofdays}</td>
    <td>{view.salary}</td>
    <td>{view.shifttime}</td>
    <td><button className="btn btn-warning" onClick={()=>updatelogic(view)}>update</button></td>
    <td><button className="btn btn-danger" onClick={()=>deletepage(view)}>remove</button></td>


</tr>
                    ))
                }
            </tbody>
        
        </ table>
    )
}
export default Employeeviewall;