package employeepackage.Employeemanagement.Controller;

import employeepackage.Employeemanagement.Dto.EmployeeDTO;
import employeepackage.Employeemanagement.Model.Employeemodel;
import employeepackage.Employeemanagement.Respository.EmployeeRespository;
import employeepackage.Employeemanagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/employee")
@RestController
@CrossOrigin
public class EmployeeController {
    @GetMapping
    public String getdata(){
        return "welcome student";
    }

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRespository employeeRespository;
    @PostMapping("/addemployee")
    public String AddEmployee(@RequestBody EmployeeDTO employeeDTO){
        Optional<Employeemodel> check=employeeRespository.findByPhone(employeeDTO.getPhone());

        if(check.isPresent()){
            return "this  "+employeeDTO.getPhone() + "  phone no is already stored";
        }else {
            return employeeService.AddEmployeelogic(employeeDTO);
        }

    }

    @GetMapping("/allemployee")
    public List<EmployeeDTO> Displayeployee(){
        return employeeService.Employeelogic();
    }


    @PutMapping("/update")
    public String UpdateEmployee(@RequestBody  EmployeeDTO employeeDTO){
        return  employeeService.Employeeupdate(employeeDTO);
    }
}
