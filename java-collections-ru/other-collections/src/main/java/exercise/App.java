package exercise;

import java.util.*;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String,Object> first, Map<String, Object> second) {
        Map<String, String> result = new LinkedHashMap<>();

        for(String elem:first.keySet()){
            result.put(elem, first.get(elem).toString());
        }
        for(String elem:second.keySet()){
            result.put(elem, second.get(elem).toString());
        }

        for(String elem:result.keySet()){
            if(!first.keySet().contains(elem) && second.keySet().contains(elem)) {
                result.replace(elem, "added");
            }
            if(first.keySet().contains(elem) && !second.keySet().contains(elem)) {
                result.replace(elem, "deleted");
            }
            if(first.keySet().contains(elem) && second.keySet().contains(elem) && first.get(elem).equals(second.get(elem))) {
                result.replace(elem, "unchanged");
            }
            if(first.keySet().contains(elem) && second.keySet().contains(elem) && !first.get(elem).equals(second.get(elem))) {
                result.replace(elem, "changed");
            }
        }

        return result;
    }
}
//END
