package leetcode;

public class FindLengthOfLastString {

    public static void main(String[] args) {
        String s = "Ajay Rathod";
        int length = findLenght(s);
        System.out.println("length of last word is "+length);
    }

    private static int findLenght(String s) {

        String x = s.trim();
        int count = 0;
        int n = x.length();

        for (int i = 0; i<n; i++) {

            if (x.charAt(i) == ' ') {
                count = 0;
            } else {
                count++;
            }
        }


        return count ;

    }
}
