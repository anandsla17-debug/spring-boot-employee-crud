package employeepackage.Employeemanagement.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_details")
public class Employeemodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empid;
    @Column(name = "name")
    private String employeename;
    @Column(name="emp_age")
    private byte age;
    @Column(name = "password")
    private  String password;
    @Column(name = "shifttime")
    private String shifttime;
    @Column(name = "noofdays")
    private int yearofdays;
    @Column(name="emp_salary")
    private double salary;
    @Column(name = "emp_phone")
    private long phone;

    public Employeemodel(String employeename, byte age, String password, String shifttime, int yearofdays, double salary, long phone) {
        this.employeename = employeename;
        this.age = age;
        this.password = password;
        this.shifttime = shifttime;
        this.yearofdays = yearofdays;
        this.salary = salary;
        this.phone = phone;
    }
public Employeemodel(){

}
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShifttime() {
        return shifttime;
    }

    public void setShifttime(String shifttime) {
        this.shifttime = shifttime;
    }

    public int getYearofdays() {
        return yearofdays;
    }

    public void setYearofdays(int yearofdays) {
        this.yearofdays = yearofdays;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
