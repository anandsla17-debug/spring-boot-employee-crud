import axios from "axios";
import { useState } from "react";

function Employeedelete(){
    const[id,setid]=useState("");
    const deletelogic=async()=>{
        try {
            const response= await axios.delete(`http://localhost:8080/employee/delete/${id}`);
            const datas= await response.data;
            alert(datas);
        } catch (error) {
            alert("backend is not connected");
        }
    }
    return(
        <>
            <div className="container border border-primary mt-2 p-3 rounded" style={{width:"300px"}}>
                <p className="h4 text-center">Delete Employee form</p>
                <label className="form-label">Employee id</label>
                <input onChange={(e)=>setid(e.target.value)} className="form-control mt-2" type="number" placeholder="Enter your empid"></input>
                <button className="btn btn-danger w-100 mt-2" onClick={deletelogic}>Delete</button>
            </div>
               
        </>
    )
}
export default Employeedelete;