package algorithms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        System.out.println(isAnagram("omo","moo"));
        System.out.println(isAnagram("emmanuel","meeamnul"));
        System.out.println(isAnagram("omo","moo"));
    }

    static boolean isAnagram(String str1, String str2) {
        final var arr1 = str1.toCharArray();
        final var arr2 = str2.toCharArray();

        final Map<Character,Integer> map = new HashMap<>();

        for(char c: arr1){
            final var newValue = map.getOrDefault(c, 0) + 1;
            map.put(c,newValue);
        }

        for (char c:arr2){
         if (!map.containsKey(c) ) return false;
         final var value = map.get(c);
         if(value < 1) return false;
         map.put(c,value - 1);
        }
        return true;
    }
}
