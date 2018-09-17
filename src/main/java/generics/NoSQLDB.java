package generics;

import java.util.HashMap;
import java.util.Map;

public class NoSQLDB<K,V> {

    Map<K,V> collection;

    public NoSQLDB() {
        this.collection = new HashMap<>();
    }

    void put(K key, V value){
        collection.put(key, value);
    }


    V get(K key){
        return collection.get(key);
    }

}
