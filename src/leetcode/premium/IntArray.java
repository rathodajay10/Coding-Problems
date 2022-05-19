package leetcode.premium;

public class IntArray {
    public static void main(String[] args) {
        int[] arr ={1,0,17,0,3};
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
            while (count <arr.length){
                arr[count++] = 0;
            }




        for (int j = 0; j <arr.length ; j++) {
            System.out.println(arr[j]);
        }
    }
}
