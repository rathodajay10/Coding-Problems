package leetcode.recursion;

public class PrintNumbersWithRec {
    public static void main(String[] args) {
       // printNum(5);
        printNum2(5);
    }

    private static void printNum(int i) {
        if (i ==0){
            return;
        }
        printNum(i-1); //
        System.out.println(i);
    }
    private static void printNum2(int i) {
        if (i ==0){
            return;
        }
        System.out.println(i);
        printNum2(i-1); //

    }
}
