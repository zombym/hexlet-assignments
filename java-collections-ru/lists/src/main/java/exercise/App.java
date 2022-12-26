package exercise;

import java.util.Arrays;
import java.util.ArrayList;

// BEGIN
public class App {
    public static boolean scrabble(String mess, String word) {
        mess = mess.toLowerCase();
        word = word.toLowerCase();

        ArrayList<String> messList = new ArrayList<String>(
                Arrays.asList(mess.split("")));
        int count = 0;
        int len = word.length();

        for (String s : word.split("")) {
            if (messList.contains(s)) {
                count++;
                messList.set(messList.indexOf(s), null);
            }
        }

        if (count == len) {
            return true;
        } else {
            return false;
        }
    }
}
//END
