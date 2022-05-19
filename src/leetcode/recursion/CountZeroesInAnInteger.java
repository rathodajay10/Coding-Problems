package leetcode.recursion;

public class CountZeroesInAnInteger {
    public static void main(String[] args) {
        int result = CountZeroes(12030450);
        System.out.println(result);
    }

    private static int CountZeroes(int i) {
        if (i == 0){
            return 0;
        }
        int smallOutput = CountZeroes(i/10);
        int lastDigit = i%10;
        if (lastDigit ==0){
            return 1+smallOutput;
        }else {
            return smallOutput;
        }
    }
}
