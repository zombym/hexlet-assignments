package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
    public class App {
        public static void swapKeyValue(KeyValueStorage storage) {
            var middle = new InMemoryKV(Map.of());

            String key;
            String value;

            System.out.println("storage before in swap " + storage);
            for(Entry elem : storage.toMap().entrySet()) {
                key = elem.getKey().toString();
                value = elem.getValue().toString();
                middle.set(value, key);
            }

            for(Entry elem : middle.toMap().entrySet()) {
                value = elem.getValue().toString();
                storage.unset(value);
            }

            for(Entry elem : middle.toMap().entrySet()) {
                key = elem.getKey().toString();
                value = elem.getValue().toString();
                storage.set(key, value);
            }

            System.out.println("storage after in swap " + storage);
        }
}
// END
