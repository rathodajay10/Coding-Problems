package leetcode.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        Stream<Integer> ls = Stream.of(1,2,3);
        List<Integer> ls1 = ls.map(x ->x *10).collect(Collectors.toList());
        System.out.println(ls1);
    }
}
