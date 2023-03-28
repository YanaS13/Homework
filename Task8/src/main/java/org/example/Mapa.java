package org.example;
import java.util.HashMap;
import java.util.Map;
public class Mapa {
    public <V,K>HashMap Map1(Map<K, V> hMap){
        Map<V, K> newMap = new HashMap<>();
        for (K key : hMap.keySet()) {
            newMap.put(hMap.get(key), key);
        }
        return (HashMap<V, K>) newMap;
    }
}

