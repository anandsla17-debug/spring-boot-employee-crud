package employeepackage.Employeemanagement.Service;


import employeepackage.Employeemanagement.Dto.EmployeeDTO;
import employeepackage.Employeemanagement.Model.Employeemodel;
import employeepackage.Employeemanagement.Respository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRespository employeeRespository; //logic query

    @Override
    public String AddEmployeelogic(EmployeeDTO employeeDTO){
Employeemodel savethedata= new Employeemodel(employeeDTO.getEmployeename(),employeeDTO.getAge(),employeeDTO
        .getPassword(),employeeDTO.getShifttime(),
        employeeDTO.getYearofdays(),employeeDTO.getSalary()
        ,employeeDTO.getPhone());
employeeRespository.save(savethedata); //store new data
return "data stored successfull";
    }




}
