package exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage{
    private Map<String, String> inmemdb = new HashMap<>();

    public InMemoryKV(Map<String, String> inmemdb) {
        this.inmemdb = new HashMap<>(inmemdb);
    }

    @java.lang.Override
    public void set(String key, String value) {
        if(this.inmemdb.containsKey(key) == true){
            this.inmemdb.replace(key, value);
        } else {
            this.inmemdb.put(key, value);
        }
    }

    @java.lang.Override
    public void unset(String key) {
        this.inmemdb.remove(key);
    }

    @java.lang.Override
    public String get(String key, String defaultValue) {
        if(this.inmemdb.containsKey(key) == true) {
            return this.inmemdb.get(key);
        } else {
            return defaultValue;
        }
    }

    @java.lang.Override
    public Map<String, String> toMap() {
        return new HashMap<>(this.inmemdb);
    }

    @Override
    public String toString() {
        return this.inmemdb.toString();
    }
}
// END
