package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LRUCacheImplementation {
    List<Integer> ls = new ArrayList<>();
    int cp = 2;
    Map<Integer,Integer> map = new HashMap<>();
    public LRUCacheImplementation(int capacity) {
        cp = capacity;
    }

    public static void main(String[] args) {


    }
    int get(int key){
        if(map.containsKey(key)){
            ls.remove(key);
            ls.add(key);
         return map.get(key);
        }else{
            return -1;
        }
    }

    void put(int key, int value){
        if (map.containsKey(key)){

        }else{
            if (ls.size() == 2)
            map.put(key,value);
        }
    }
}
