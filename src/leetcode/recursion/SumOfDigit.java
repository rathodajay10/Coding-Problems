package leetcode.recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        int sum = sumOfDigit(12345);
        System.out.println(sum);
    }

    private static int sumOfDigit(int i) {
        if (i==0){
            return 0;
        }
        int smallanswer = sumOfDigit(i/10);

        //calculate last digit
        int lastDigit = i%10;

        return smallanswer +lastDigit;
    }
}
