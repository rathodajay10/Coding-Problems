package leetcode;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String s = "abc";
        char[] reverseString
                = new char[s.length()];
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i<s.length();i++){
            stack.push(s.charAt(i));
        }

        int i = 0;
        while (!stack.empty()){
            reverseString[i++] = stack.pop();
        }

        System.out.println("reverse string is "+new String(reverseString));

    }
}
