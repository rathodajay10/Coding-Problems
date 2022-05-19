package leetcode.recursion;

public class FibbonachhiUsingRecursion {
    public static void main(String[] args) {
        int result = fib(5);
        System.out.println(result);
    }

    private static int fib(int i) {
        //these are the base cases
        if (i ==0){
            return 0;
        }
        if(i==1){
            return 1;
        }
        int smalloutput1 = fib(i-1);
        int smalloutPut2 = fib(i-2);

        return smalloutput1+smalloutPut2;

    }
}
