package employeepackage.Employeemanagement.Dto;

import employeepackage.Employeemanagement.Model.Employeemodel;
import jakarta.persistence.Column;

public class EmployeeDTO {
    private int empid;

    private String employeename;

    private byte age;

    private  String password;

    private String shifttime;

    private int yearofdays;

    private double salary;

    private long phone;

    public EmployeeDTO(String employeename, byte age, String password, String shifttime, int yearofdays, double salary, long phone) {
        this.employeename = employeename;
        this.age = age;
        this.password = password;
        this.shifttime = shifttime;
        this.yearofdays = yearofdays;
        this.salary = salary;
        this.phone = phone;
    }
public EmployeeDTO(){

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
