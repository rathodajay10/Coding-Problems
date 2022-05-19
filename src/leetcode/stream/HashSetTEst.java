package leetcode.stream;

import java.util.HashSet;


public class HashSetTEst {

    public static void doSomethingWithHashSet() {
        HashSet<Student> student = new HashSet();
        student.add(new Student("Ajay"));
        student.add(new Student("Ajay"));
        System.out.println("sizze of hashset : "+student.size());
    }

    public static void main(String[] args) {
        doSomethingWithHashSet();

    }
}
class Student {

    String name;
    public Student(String name) {
        this.name = name;
    }
}
