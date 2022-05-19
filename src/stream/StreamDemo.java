//package stream;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class StreamDemo {
//    public static void main(String[] args) {
//
//        List<Employee> empList = getEmpList();
//
//        //empList.stream().filter(x -> x.getGender().equals("Female")).forEach(e -> System.out.println(e));
//
//       // empList.stream().filter(x -> x.getNewJoiner().equalsIgnoreCase("True")).forEach( e -> System.out.println(e));
//
////        empList.stream().sorted(Comparator.comparing(Employee::getRating).reversed())
////                .forEach(e -> System.out.println(e));
//
////        empList.stream().sorted(Comparator.comparing(Employee::getSalary))
////                .sorted(Comparator.comparing(Employee::getRating))
////                .forEach(e -> System.out.println(e));
//
//        //employee with max salary
////        empList.stream().max(Comparator.comparing(Employee::getSalary))
////                .ifPresent(System.out::println);
////        empList.stream().max(Comparator.comparing(Employee::getRating))
////                .ifPresent(System.out::println);
//
////        empList.stream().min(Comparator.comparing(Employee::getSalary))
////                .ifPresent(System.out::println);
//
//        //group all employee by gender
//
//        Map<String, List<Employee>>
//
//                emps = empList.stream().collect(Collectors.groupingBy(Employee::getGender));
//
//        emps.forEach((g,e) -> {
//            System.out.println(g);
//            e.forEach(System.out::println);
//        });
//
//
//
//      //  System.out.println(empGEnder.toString());
//
//
//    }
//
//    public static List<Employee> getEmpList(){
//        return Arrays.asList(
//                new Employee("59-385-1088","Zacharias","Schwerin","zchwerin@gmail.com","Male","True",101146,0),
//                new Employee("73-274-6476","Kyle","Frudd","kfrudd1@ovh.net","Male","FALSE",29310,2),
//                new Employee("85-939-9584","Axe","Gumb","agumb2@twitter.com","Female","FALSE",62291,4),
//                new Employee("08-180-8292","Robinet","Batterham","rbatterham3@last.fm","Male","FALSE",142439,4),
//                new Employee("21-825-2623","Ulick","Burrel","uburrel4@google.ru","Male","FALSE",128764,5),
//                new Employee("66-708-5539","Tailor","Ridding","Ridding","Female","FALSE",152924,4),
//                new Employee("81-697-2363","Joete","Braybrooke","jbraybrooke6@prnewswire.com","Male","TRUE",128907,0),
//                new Employee("63-019-1110","Elroy","Baverstock","ebaverstock7@ehow.com","Male","TRUE",2510,0)
//        );
//    }
//}
//
