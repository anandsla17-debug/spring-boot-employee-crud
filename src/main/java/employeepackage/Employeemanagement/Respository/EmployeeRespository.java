package employeepackage.Employeemanagement.Respository;

import employeepackage.Employeemanagement.Model.Employeemodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<Employeemodel,Integer> {
}
