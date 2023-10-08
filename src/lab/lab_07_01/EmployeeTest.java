package lab.lab_07_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        FTE emp1 = new FTE();
        FTE emp2 = new FTE();
        ContractEmployee emp3 = new ContractEmployee();
        ContractEmployee emp4 = new ContractEmployee();
        ContractEmployee emp5 = new ContractEmployee();
        List<Employee> emp = new ArrayList<>(Arrays.asList(emp1,emp2,emp3,emp4,emp5));
        System.out.println(new EmployeeController().calculateTotalSalary(emp));
    }
}
