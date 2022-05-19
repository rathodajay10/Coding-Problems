package leetcode;

public class FizzBuzzProb {

    public static void main(String[] args) {
        //FizzBuzz problem
        //n = 15...3= fizz 5 = buzz...3 & 5 FizzBuzz
        for (int i = 1; i <=15 ; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else if ((i % 3 == 0)  ){
                System.out.println("Fizz");
            }else{
                System.out.println(Integer.valueOf(i));
            }
        }
    }
}
