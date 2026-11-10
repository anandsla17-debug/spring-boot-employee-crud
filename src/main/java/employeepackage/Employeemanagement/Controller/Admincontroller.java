package employeepackage.Employeemanagement.Controller;

import employeepackage.Employeemanagement.Dto.AdminDto;
import employeepackage.Employeemanagement.Model.Adminmodel;
import employeepackage.Employeemanagement.Respository.AdminRespository;
import employeepackage.Employeemanagement.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class Admincontroller {
    @Autowired
    private AdminService adminService;

    @Autowired
    private AdminRespository adminRespository;
    @PostMapping("/reg")
    public Adminmodel Register(@RequestBody AdminDto adminDto){
        Optional<Adminmodel> find= adminRespository.findByAdminid(adminDto.getAdminid());
        if(find.isEmpty()) {
            return adminService.register(adminDto);
        }else{
           return  new  Adminmodel("admin id already stored", adminDto.getAdminname(), adminDto.getAdminpassword());

        }

    }
}
