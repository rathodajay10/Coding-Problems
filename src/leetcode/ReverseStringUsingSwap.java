package leetcode;

public class ReverseStringUsingSwap {

    public static void main(String[] args) {
        String str = "ajay";
        char[] ch = str.toCharArray();

        for (int i = ch.length-1; i >=0 ; i--) {

            System.out.println(ch[i]);
        }

        reverseString(str);
    }

    private static void reverseString(String str) {


    }
}
