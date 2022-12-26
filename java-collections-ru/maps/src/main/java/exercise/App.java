package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map getWordCount(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        if (sentence.isEmpty()) {
            return result;
        }

        ArrayList<String> wordList = new ArrayList<String>(
                Arrays.asList(sentence.split(" ")));

        for (String word : wordList) {
            if (result.isEmpty()) {
                result.put(word, 1);
            } else {
                if (result.keySet().contains(word)) {
                    var count = result.get(word) + 1;
                    result.replace(word, count);
                } else {
                    result.put(word, 1);
                }
            }
        }
        return result;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }
        String msg = "{\n";
        for (String key : map.keySet()) {
            msg = msg + "  " + key+": " + map.get(key) + "\n";
        }
        return msg + "}";
    }
}
//END
