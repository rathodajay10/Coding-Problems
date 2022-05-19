package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {


    public static void main(String[] args) {

        Employee e1 = new Employee("ajay",100,new Address("pune","pune"));
        Employee e2 = new Employee("ajay",10,new Address("nashik","pune"));
        Employee e3 = new Employee("ajay",1,new Address("aurangabad","pune"));

        List<Employee> ls = Arrays.asList(e1,e2,e3);

        ls.stream().
                filter(employee -> employee.getAddress().
                        stream().anyMatch(adr -> adr.getCity().startsWith("p"))).
                         filter(x -> x.getSalary() <50).
                        forEach(System.out::println);

    }
}
