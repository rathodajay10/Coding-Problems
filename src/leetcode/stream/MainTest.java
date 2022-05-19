package leetcode.stream;

import java.util.HashSet;

public class MainTest {
    public static void main(String[] args) {
        Child child = new Child();
        //Will this below line compile
        child.foo();
        //Will this below line compile
        child.bar();
    }
}

class Parent {

    public void foo() {
        System.out.println("Parent :: foo()");
    }
}

class Child extends Parent {

    @Override
    public void foo() {
        System.out.println("Child :: foo()");
    }

    public void bar() {
        System.out.println("Child :: bar()");
    }
}

