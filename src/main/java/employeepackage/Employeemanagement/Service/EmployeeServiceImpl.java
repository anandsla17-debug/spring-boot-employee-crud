package employeepackage.Employeemanagement.Service;


import employeepackage.Employeemanagement.Dto.EmployeeDTO;
import employeepackage.Employeemanagement.Model.Employeemodel;
import employeepackage.Employeemanagement.Respository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
public List<EmployeeDTO> Employeelogic(){
        List<Employeemodel> get= employeeRespository.findAll();
        List<EmployeeDTO> tranfer=new ArrayList<>();
        for(Employeemodel gets:get  ){
EmployeeDTO set=new EmployeeDTO();
set.setEmpid(gets.getEmpid());
set.setEmployeename(gets.getEmployeename());
set.setAge(gets.getAge());
set.setPhone(gets.getPhone());
set.setSalary(gets.getSalary());
set.setShifttime(gets.getShifttime());
set.setYearofdays(gets.getYearofdays());

          tranfer.add(set);
        }
        return  tranfer;
}






}
