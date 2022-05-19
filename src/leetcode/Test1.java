package leetcode;

public class Test1 {
    public static void main(String[] args) {
        String str = "ajay";
        String reverseString ="";
        for ( int i = str.length()-1; i >= 0 ; i--) {
            reverseString = reverseString + str.charAt(i);
        }
        System.out.println("original string  = "+str);
        System.out.println("reverse string   =  "+reverseString);
    }
}
