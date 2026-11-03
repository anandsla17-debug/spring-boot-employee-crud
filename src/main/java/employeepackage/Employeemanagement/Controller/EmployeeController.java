package employeepackage.Employeemanagement.Controller;

import employeepackage.Employeemanagement.Dto.EmployeeDTO;
import employeepackage.Employeemanagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/employee")
@RestController
public class EmployeeController {
    @GetMapping
    public String getdata(){
        return "welcome student";
    }

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/addemployee")
    public String AddEmployee(@RequestBody EmployeeDTO employeeDTO){
       return employeeService.AddEmployeelogic(employeeDTO);

    }

}
