package leetcode.recursion;

class m{
    void eat(){
        System.out.println("m");
    }
}
class c extends m{
    void eat(){
        System.out.println("c");
    }
}
class h extends c{
    void eat(){
        System.out.println("h");
    }
}


public class Test1 {
    public static void main(String[] args) {
        m m1 = new h();
        c c1 = new h();

        c1.eat();
    }
}
