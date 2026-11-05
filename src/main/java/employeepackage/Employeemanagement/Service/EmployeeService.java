package employeepackage.Employeemanagement.Service;

import employeepackage.Employeemanagement.Dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    public String AddEmployeelogic(EmployeeDTO employeeDTO);
    public List<EmployeeDTO> Employeelogic();
    public String Employeeupdate(EmployeeDTO employeeDTO);
}
