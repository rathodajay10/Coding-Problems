package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseAList {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        revrseList(list);
        System.out.println(list);
    }

    private static void revrseList(List<Object> list) {

        if (list.size() <= 1 || list == null)
            return;
        Object value = list.remove(0);

        revrseList(list);

        list.add(value);
    }
}
