package employeepackage.Employeemanagement.Service;


import employeepackage.Employeemanagement.Dto.EmployeeDTO;
import employeepackage.Employeemanagement.Model.Employeemodel;
import employeepackage.Employeemanagement.Respository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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


@Override
public String Employeeupdate(EmployeeDTO employeeDTO){
        Optional<Employeemodel> update=employeeRespository.findById(employeeDTO.getEmpid());

        if(update.isPresent()){
             Employeemodel sets=update.get();
             sets.setEmployeename(employeeDTO.getEmployeename());
            sets.setAge(employeeDTO.getAge());
            sets.setPassword(employeeDTO.getPassword());
            sets.setSalary(employeeDTO.getSalary());
            sets.setShifttime(employeeDTO.getShifttime());
            sets.setYearofdays(employeeDTO.getYearofdays());
            sets.setPhone(employeeDTO.getPhone());
            employeeRespository.save(sets);
            return "updated";
        }
        else {
            return "not updated";
        }



}


@Override
    public String Deleteemployee(int id){
Optional<Employeemodel> check= employeeRespository.findById(id);
if(check.isPresent())
{
    employeeRespository.deleteByEmpid(id);
    return "employee data is deleted";
}
else {
    return  "employee data in present in database";
}

    }

    @Override
    public List<EmployeeDTO> employeedisplayid(int id){
        Optional<Employeemodel> collect= employeeRespository.findById(id);
        List<EmployeeDTO> transfer= new ArrayList<>();
        if(collect.isPresent()) {
            Employeemodel gets = collect.get();
            EmployeeDTO set = new EmployeeDTO();
            set.setEmpid(gets.getEmpid());
            set.setEmployeename(gets.getEmployeename());
            set.setAge(gets.getAge());
            set.setPhone(gets.getPhone());
            set.setSalary(gets.getSalary());
            set.setShifttime(gets.getShifttime());
            set.setYearofdays(gets.getYearofdays());
            transfer.add(set);

        }else{
            EmployeeDTO set = new EmployeeDTO();
            set.setEmpid(0);
            set.setEmployeename("not present");
            set.setAge((byte)0);
            set.setPhone(0);
            set.setSalary(0);
            set.setShifttime("not present");
            set.setYearofdays(0);
            transfer.add(set);
        }
        return transfer;
    }

}
