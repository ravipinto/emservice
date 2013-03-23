package service;

public class Employee {
    
    private String employeeName;
    private int annualSales;
    private String employeeId;
    private String department;
    
    public Employee() {
        super();
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setAnnualSales(int annualSales) {
        this.annualSales = annualSales;
    }

    public int getAnnualSales() {
        return annualSales;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
