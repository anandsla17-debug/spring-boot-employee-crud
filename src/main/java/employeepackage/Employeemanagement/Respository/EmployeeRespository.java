package employeepackage.Employeemanagement.Respository;

import employeepackage.Employeemanagement.Model.Employeemodel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRespository extends JpaRepository<Employeemodel,Integer> {

    Optional<Employeemodel> findByPhone(long phone);
    //select * from employee where phone=?

    @Transactional
    void deleteByEmpid(int empid);
}
