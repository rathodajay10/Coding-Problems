package leetcode.recursion;

public class FibboPwer {
    public static void main(String[] args) {
        //calculate power of function like x*x*x
        //if you want to caluate power write like this , pow(x,n) = pow (x,n-1)*x;
        int result = powerFun(5,3);
        System.out.println(result);
    }

    private static int powerFun(int x, int n) {
        if (n == 0){
            return 1;
        }

        //recursive case
        int smalloutput = powerFun(x,n-1)*x;
        return smalloutput;
    }
}
