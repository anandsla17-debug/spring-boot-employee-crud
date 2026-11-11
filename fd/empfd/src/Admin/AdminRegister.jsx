import axios from "axios";
import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";

function AdminRegister(){

    const[id,setid]=useState("");
    const[name,setname]=useState("");
    const[password,setpassword]=useState("");
const navigate=useNavigate();
    const registerlogic=async()=>{
        const admin={
            adminid:id,
            adminname:name,
            adminpassword:password
        }
        try {
            const response= await axios.post("http://localhost:8080/admin/reg",admin);
            const datas=response.data;

            if(datas.adminid=="admin id already stored"){
            alert(datas.adminid);
             console.log(response);

           


            }else{
                alert("admin reg updated " +datas.adminid+ " adminid stored")
                navigate("/");
            }
        } catch (error) {
            alert("backend is not connected");
        }

    }
    return(
        <>
        <div className="container border border-primary mt-2 p-3 rounded" style={{width:"300px"}}>
            <p className="text-center mt-2 h4">Admin Register</p>
            <input onChange={(e)=>setid(e.target.value)} className="form-control mt-2" type="text" placeholder="Enter your id"></input>
            <input onChange={(e)=>setname(e.target.value)} className="form-control mt-2" type="text" placeholder="Enter your name"></input>
            <input onChange={(e)=>setpassword(e.target.value)} className="form-control mt-2" type="password" placeholder="Enter your password"></input>
            <button className="btn btn-success w-100" onClick={registerlogic}>Register</button>
            <p className="mt-2">Do you have an Account ?<Link to="/" className="btn btn-warning">Sign in</Link></p>
        </div>
        </>
    )
}
export default AdminRegister;