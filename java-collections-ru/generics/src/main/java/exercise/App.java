package exercise;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String,String>> books, Map<String, String> search){
        List<Map<String,String>> result = new ArrayList<>();
        System.out.println(search);
        if(books.isEmpty()){
            return result;
        }
        for (Map<String, String> book : books) {
            int count = 0;
            for (String elem: search.keySet()){
                if(book.get(elem).equals(search.get(elem))){
                    count++;
                }
            }
            if (count == search.size()) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
