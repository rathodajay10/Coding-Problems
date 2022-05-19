package alphasense;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, 5, 6, -7, 8, 9, 10};
        List<Integer> ls = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, 9, 10);
        System.out.println(ls.stream().map(x-> {
            if(x < 0 || x % 2 == 0){
                return x;
            }else if(x %2==1){
                return x*2;
            }else if(x < 0){
                return 0;
            }
            return null;
        }).collect(Collectors.summingInt(Integer::intValue)));
    }
}
