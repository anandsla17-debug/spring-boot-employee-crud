package employeepackage.Employeemanagement.Service;

import employeepackage.Employeemanagement.Dto.AdminDto;
import employeepackage.Employeemanagement.Model.Adminmodel;
import employeepackage.Employeemanagement.Respository.AdminRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceimpl implements  AdminService{

    @Autowired
    public AdminRespository adminRespository;

    @Override
    public Adminmodel   register(AdminDto adminDto){
        Adminmodel savethedata=new Adminmodel(adminDto.getAdminid(), adminDto.getAdminname(),adminDto.getAdminpassword());
      return adminRespository.save(savethedata);
    }
}
