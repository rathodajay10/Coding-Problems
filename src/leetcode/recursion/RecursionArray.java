package leetcode.recursion;

public class RecursionArray {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6};
        int n = arr.length;
        Boolean reult = checkIfArrayIssorted(arr,n);
        System.out.println(reult);
    }

    static boolean arraySortedOrNot(int a[], int n)
    {
        // base case
        if (n == 1 || n == 0)
            return true;

        // check if present index and index
        // previous to it are in correct order
        // and rest of the array is also sorted
        // if true then return true else return
        // false
        return a[n - 1] >= a[n - 2]
                && arraySortedOrNot(a, n - 1);
    }

    private static Boolean checkIfArrayIssorted(int arr[],int n) {


        if(n ==0 || n ==1){
            return true;
        }
        if(arr[0] >arr[1]){
            return false;
        }

        for (int i = 1; i < n ; i++) {
            if (arr[i-1] > arr[i]);
            return false;

        }

        return true;

    }
}
