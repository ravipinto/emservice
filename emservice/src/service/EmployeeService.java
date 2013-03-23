package service;

import java.util.ArrayList;

import javax.jws.WebService;

import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "EmployeeService", portName = "EmployeeServiceSoap12HttpPort")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class EmployeeService {
    public EmployeeService() {
        super();
    }
    
    public ArrayList<Employee> getEmployees() {
        ArrayList<Employee> list = new ArrayList<Employee>();
        Employee e = null;
        e = new Employee();
        e.setAnnualSales(300000);
        e.setDepartment("FMW");
        e.setEmployeeId("0001");
        e.setEmployeeName("Abhinav");
        list.add(e);
        e = new Employee();
        e.setAnnualSales(500000);
        e.setDepartment("Database");
        e.setEmployeeId("0002");
        e.setEmployeeName("Ravi");
        list.add(e);
        e = new Employee();
        e.setAnnualSales(600000);
        e.setDepartment("Fusion Apps");
        e.setEmployeeId("0003");
        e.setEmployeeName("Sudhir");
        list.add(e);
        e = new Employee();
        e.setAnnualSales(620000);
        e.setDepartment("OAF");
        e.setEmployeeId("0004");
        e.setEmployeeName("Krishna");
        list.add(e);
        return list;
    }
}
