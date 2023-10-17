package lesson.lesson_09_01;

import lab.lab_07_01.Employee;

import java.util.List;

public class EmployeeController {
    public int getTotalSalary(List<Employee> empList){
        int totalSlary = 0;
        for(Employee emp:empList){
            totalSlary = totalSlary + emp.getSalary();
        }
        return totalSlary;
    }
}
