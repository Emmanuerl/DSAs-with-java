package algorithms;

import java.util.*;

public class First25AlphabetsIn2D {
    public static void main(String[] args) {
        var cursor = 0;
        var map = new TreeMap<Integer, List<String>>();

        for (int i = 0; i < 25; i++){
            if(i%5 == 0){
                var arr = new ArrayList<String>();
                arr.add(cTs(65+i));
                map.put(cursor, arr);
                cursor++;
            }else{
                map.get(cursor - 1).add(cTs(65+i));
            }
        }
        int[] numbers = new int[]{};
    }

    static String cTs(int i){
        return String.format("%c",(char)i);
    }
}
