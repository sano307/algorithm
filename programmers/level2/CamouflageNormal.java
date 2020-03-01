import java.io.*;
import java.util.*;

class CamouflageNormal {
    public static void main(String[] args) {

        String[][] clothes = new String[][]{
            {"yellow_hat", "headgear"},
            {"blue_sunglasses", "eyewear"},
            {"green_turban", "headgear"}
        };

        HashMap<String, Integer> map = new HashMap<>();
        for (String[] c : clothes) {
            String kind = c[1];
            map.put(kind, map.getOrDefault(kind, 0) + 1);
        }

        int combinations = 1;
        for (int amount : map.values()) {
            combinations *= (amount + 1);
        }
        
        System.out.println(combinations - 1);
        /**
         * - Output
         * 5
         */
    }
}
