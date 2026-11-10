package employeepackage.Employeemanagement.Model;

import jakarta.persistence.*;
import org.jspecify.annotations.NonNull;

@Entity
@Table(name="admin_detials")
public class Adminmodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    @Column(name = "admin_id",unique = true)
    private String adminid;
    private String adminname;
    private String adminpassword;

    public Adminmodel(String adminid, String adminname, String adminpassword) {
        this.adminid = adminid;
        this.adminname = adminname;
        this.adminpassword = adminpassword;
    }
public Adminmodel(){

}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }
}
