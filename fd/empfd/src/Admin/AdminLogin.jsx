import axios from "axios";
import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";

function Adminlogin(){

    const[id,setid]=useState("");
    const[password,setpassword]=useState("");
    const navigate=useNavigate();
    const loginlogic=async()=>{
        const login={
            adminid:id,
            adminpassword:password
        }
        try {
            const response=await axios.post("http://localhost:8080/admin/login",login);
        const datas=await response.data;
      
if(datas=="login successful"){
    alert(datas);
    navigate("/home")
}else{
alert(datas)
}
    } catch (error) {
            alert("backend is not connected");
        }
    }
    return(
        <div className="container p-3 border border-primary rounded mt-2" style={{width:"300px"}}>
            <p className="h4 text-center" >Admin login</p>
            <input onChange={(e)=>setid(e.target.value)} className="form-control mt-2" type="text" placeholder="Enter your id"></input>
            <input onChange={(e)=>setpassword(e.target.value)} className="form-control mt-2" type="password" placeholder="Enter your password"></input>
            <button onClick={loginlogic} className="btn btn-success w-100 mt-2">Login</button>
            <p className="text-center mt-2">Do not have an account?<Link to="/Register" className="btn btn-warning">Sign up</Link></p>
        
        </div>
    )
}
export default Adminlogin;