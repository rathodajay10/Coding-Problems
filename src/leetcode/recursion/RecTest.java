package leetcode.recursion;

public class RecTest {
    public static void main(String[] args) {
        int n = -5;
        int ans = 0;
        ans  = findFactorial(n);

        System.out.println(ans);
    }

    private static int findFactorial(int n) {
       // int ans =0;
        if (n==0) return 1;
        if (n<0) return -1;
        int ans = findFactorial(n-1);
        return n*ans;
    }
}
