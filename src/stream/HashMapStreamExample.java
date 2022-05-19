package stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HashMapStreamExample {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        books.put("123-A", "DS");
        books.put( "324-A", "c++");
        books.put("213-B", "Java");

        Optional<String> result = books.entrySet().
                stream().
                filter(e -> e.getValue().equalsIgnoreCase("Java")).
                map(Map.Entry::getKey).findFirst();

        System.out.println(result);
    }
}
