package lab.lab_07_01;

import java.util.List;

public class EmployeeController {
    public int calculateTotalSalary(List<Employee> list){
        int totalSalary = 0;
        for(Employee emp:list){
            totalSalary = totalSalary + emp.getSalary();
        }
        return totalSalary;
    }
}
