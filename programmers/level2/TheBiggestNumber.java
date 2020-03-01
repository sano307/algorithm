import java.io.*;
import java.util.*;

class TheBiggestNumber {
    public static void main(String[] args) {

        int[] numbers = new int[]{3, 30, 34, 5, 9};

        ArrayList<String> list = new ArrayList<String>();
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            list.add(String.valueOf(numbers[i]));
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String front, String back) {
                return (back + front).compareTo(front + back);
            }
        });

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(list.get(i));
        }

        if (sb.charAt(0) == '0') {
            System.out.println("0");
        } else {
            System.out.println(sb.toString());
        }
    }
}
