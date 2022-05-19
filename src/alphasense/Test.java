package alphasense;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        String str ="Fear leads to anger; anger leads to hatred; hatred leads to conflict; conflict leads to suffering.";

        int count =1;
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            if((str.charAt(i)== ' ') && (str.charAt(i+1) !=' ')){
                if(hm.containsKey(str.charAt(i))){
                    hm.put(str.charAt(i),hm.get(str.charAt(i)+1));
                }

                else{
                    hm.put(str.charAt(i),hm.get(str.charAt(i)));
                }

            }
        }
        System.out.println(hm);


    }
}
