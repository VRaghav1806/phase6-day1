package com.example.employee.Service;

import com.example.employee.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employeeList = new ArrayList<>();

    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public Employee getEmployeeById(int id) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee emp = employeeList.get(i);
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public Employee updateEmployee(int id, Employee updatedEmployee) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee emp = employeeList.get(i);
            if (emp.getId() == id) {
                emp.setName(updatedEmployee.getName());
                emp.setDepartment(updatedEmployee.getDepartment());
                return emp;
            }
        }
        return null;
    }

    public String deleteEmployee(int id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.remove(i);
                return "Employee deleted";
            }
        }
        return "Employee not found";
    }
}
