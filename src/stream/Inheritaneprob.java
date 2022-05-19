package stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inheritaneprob {
    public static void main(String[] args) {
        try {
            SuperType superType = new SubType();
            superType.m2();
            superType.m1();
            InputStreamReader inp = null;

            // Storing the input in inp
            inp = new InputStreamReader(System.in);
        }catch(Exception e2){

        }
    }
}

class SuperType{
    void m1(){
        System.out.println("in m1");
    }
    void m2(){

    }
}

class SubType extends SuperType{
    void  m1(){
        System.out.println("in m1");
    }
    void  m2(){

        System.out.println("in m2");

    }
}
