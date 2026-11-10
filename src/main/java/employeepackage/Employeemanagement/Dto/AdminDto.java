package employeepackage.Employeemanagement.Dto;

public class AdminDto {

    private int id;
    private String adminid;
    private String adminname;
    private String adminpassword;
public  AdminDto(){

}
    public AdminDto(String adminid, String adminname, String adminpassword) {
        this.adminid = adminid;
        this.adminname = adminname;
        this.adminpassword = adminpassword;
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
