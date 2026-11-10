package employeepackage.Employeemanagement.Service;

import employeepackage.Employeemanagement.Dto.AdminDto;
import employeepackage.Employeemanagement.Model.Adminmodel;

public interface AdminService {
    public Adminmodel register(AdminDto adminDto);
    public String loginlogic(AdminDto adminDto);
}
