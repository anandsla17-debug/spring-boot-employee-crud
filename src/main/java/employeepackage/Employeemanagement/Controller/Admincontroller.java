package employeepackage.Employeemanagement.Controller;

import employeepackage.Employeemanagement.Dto.AdminDto;
import employeepackage.Employeemanagement.Model.Adminmodel;
import employeepackage.Employeemanagement.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class Admincontroller {
    @Autowired
    private AdminService adminService;
    @PostMapping("/reg")
    public Adminmodel Register(@RequestBody AdminDto adminDto){

        return adminService.register(adminDto);

    }
}
