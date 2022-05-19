//package leetcode;
//
//import java.util.Deque;
//import java.util.Stack;
//
//public class ParanthesisTest {
//
//    public static void main(String[] args) {
//        String str = "[]})";
//        boolean ans = isParanthesis(str);
//    }
//
//    private static boolean isParanthesis(String str) {
//        Stack<Character> dqStack = new Stack<Character>();
//
//        for (int i = 0; i< str.length();i++){
//            char x = str.charAt(i);
//
//            if (x == '{' || x == '[' || x == '('){
//                dqStack.push(x);
//                continue;
//            }
//
//            if (dqStack.isEmpty()){
//                return false;
//            }
//            char cheq;
//
//            switch (i){
//                case ')' :
//
//            }
//        }
//
//
////    }
//}
