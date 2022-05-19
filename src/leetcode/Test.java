package leetcode;

import leetcode.stream.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Ajay",100);
        Employee emp2 = new Employee(1,"name",100);
        Employee emp3 = new Employee(1,"Ajay",100);
        Employee emp4 = new Employee(1,"name",100);
        Employee emp5 = new Employee(1,"Ajay",100);

        List<Employee> empList = Arrays.asList(emp1,emp2,emp3,emp4,emp5);
        Map<String,Long> answer = empList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
        System.out.println(answer);

    }
}
