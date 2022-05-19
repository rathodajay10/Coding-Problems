package leetcode.recursion;

public class CountDIgitsInNumber {
    public static void main(String[] args) {
        int result = countNumber(1245);
        System.out.println(result);
    }

    private static int countNumber(int n) {
        if (n ==0){
            return 0;
        }
        int smallOutput = countNumber(n/10);
        return smallOutput+1;
    }
}
