package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class AdacentDuplicateDeletion {
    public static void main(String[] args) {
        String str = "abbaca";
         removeDuplicates(str);
        //System.out.println("given String is palindrome = "+result);
    }

    private static void removeDuplicates(String str) {
        Stack<Character> stack = new Stack<>();
        char[] A = str.toCharArray();
        for (int i = 1; i <A.length ; i++) {
            if (stack.size() == 0 || A[i] != stack.peek()){
                stack.push(A[i]);
            }else{
                 stack.pop();
            }
        }


    }
}
