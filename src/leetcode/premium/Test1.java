package leetcode.premium;

public class Test1 {

    public static void main(String[] args) {

        int test = Test1.test();
        System.out.println(test);
    }
    public static int test() {
        int i = 1;
        try {
            return i;
        } finally {
            i = 2;
        }
    }
}
