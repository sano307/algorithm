import java.io.*;
import java.util.*;
import static java.util.stream.Collectors.*;

class CamouflageFunctional {
    public static void main(String[] args) {

        String[][] clothes = new String[][]{
            {"yellow_hat", "headgear"},
            {"blue_sunglasses", "eyewear"},
            {"green_turban", "headgear"}
        };

        int combinations = Arrays.stream(clothes)
                .collect(groupingBy(c -> c[1], mapping(c -> c[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (kind, amount) -> kind * (amount + 1))).intValue() - 1;

        System.out.println(combinations);
        /**
         * - Output
         * 5
         */
    }
}
