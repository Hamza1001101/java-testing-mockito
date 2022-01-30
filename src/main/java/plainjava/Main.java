package plainjava;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String text = "it was the best of times, it was the worst of times.";
        System.out.println(mostCommonWords(text));
    }

    private static String mostCommonWords(String input) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : input.split(" ")) {
            Integer wordCount = map.get(word);
            if (map.get(word) == null) {
                wordCount = 0;
            }
            map.put(word, wordCount + 1);
        }
        return  Arrays.toString(map.entrySet().toArray()); 
        //return map.entrySet().toArray();
    }
}
