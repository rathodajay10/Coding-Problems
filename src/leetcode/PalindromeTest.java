package leetcode;

public class PalindromeTest {
    public static void main(String[] args) {
        String str = "babad";
        Boolean result = isPalinfrom(str);
        System.out.println("given String is palindrome = "+result);
    }

    private static Boolean isPalinfrom(String str) {
        int start = 0;
        int end = str.length()-1;
        while (start <= end){
            if(str.charAt(start) != str.charAt(end)){
               //if we can delete one stamenet and make it aplindrome we can do it
                if (checkPal(str,start+1,end) || checkPal(str,start,end-1)){
                    return true;
                }else {
                    //after deleting one char we are not able to obtain the char string
                    return false;
                }

            }
            start++;
            end--;
        }
        return true;
    }

    private static Boolean checkPal(String str, int start, int end) {
        while (start <= end){
            if (str.charAt(start) != str.charAt(end)){
                return false;

            }
            start++;
            end--;
        }
        return true;
    }
}
