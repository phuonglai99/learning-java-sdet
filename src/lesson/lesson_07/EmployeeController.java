package lesson.lesson_07;

import lab.lab_07_01.Employee;

import java.util.List;

public class EmployeeController {
    public static int getTotalSalary(List<Employee> lst){
        int totalSalary = 0;
        for(Employee epm:lst){
            totalSalary = totalSalary+epm.getSalary();
        }
        return totalSalary;
    }
}
