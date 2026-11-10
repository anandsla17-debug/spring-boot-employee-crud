package employeepackage.Employeemanagement.Respository;

import employeepackage.Employeemanagement.Dto.AdminDto;
import employeepackage.Employeemanagement.Model.Adminmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRespository extends JpaRepository<Adminmodel,Integer> {

    Optional<Adminmodel>  findByAdminid(String adminid);
}
