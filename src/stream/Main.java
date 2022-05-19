package stream;

public class Main {
    public static void main(String[] args) {
        SuperC c=new SubCla();
        c.methodToOverride1();
        c.methodToOverride2();
    }
}
 class SuperC {
    public void methodToOverride1(){
        System.out.println("in methodToOverride1");
    }
    public  void methodToOverride2(){
        System.out.println("in methodToOverride2");
    }
}
 class SubCla extends SuperC{
    public void methodToOverride1(){
        System.out.println("in methodToOverride1-sub");
    }
    public void methodToOverride2(){
        System.out.println("in methodToOverride2-sub");
    }
}
