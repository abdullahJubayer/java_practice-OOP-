
package Association;

import java.util.ArrayList;

/**
 *
 * @author Abdullah jubayer
 */
public class Employee {
    String employeeName;
    String employeeId;
    String employeeDesignation;
    String employeeSalary;
    /*has a relation(one to one)*/
    EmployeeAddress employeeAddress;
    ArrayList<EmployeeProjects> employeeProject;

    public Employee(String employeeName, String employeeId, String employeeDesignation,
            String employeeSalary, EmployeeAddress employeeAddress,ArrayList<EmployeeProjects> employeeProject) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeDesignation = employeeDesignation;
        this.employeeSalary = employeeSalary;
        this.employeeAddress=employeeAddress;
        this.employeeProject=employeeProject;
    }
    public ArrayList<EmployeeProjects> getEmployeeProject(){
        return employeeProject;
    }
    public EmployeeAddress getEmployeeAddress(){
        return employeeAddress;
    }
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    
}
