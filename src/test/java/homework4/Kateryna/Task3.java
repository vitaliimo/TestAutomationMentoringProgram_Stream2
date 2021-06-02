package homework4.Kateryna;

import java.util.*;

public class Task3 {

    public static <K, V> Map<V, Collection<K>> reversedValues(Map<? extends K, ? extends V> initialMap) {

        Map<V, Collection<K>> reversedMap = new HashMap<>();
        for (K oldKey : initialMap.keySet()) {
            V newKey = initialMap.get(oldKey);
            if (!reversedMap.containsKey(newKey)) {
                Collection<K> listValues = new ArrayList<>();
                listValues.add(oldKey);
                reversedMap.put(newKey, listValues);
            } else {
                Collection<K> listValues = reversedMap.get(newKey);
                listValues.add(oldKey);
                reversedMap.put(newKey, listValues);
            }
        }
        return reversedMap;
    }
    public static void main(String[] args) {
        Map<String, String> initialMap = new HashMap<>();
        initialMap.put("k1", "v1");
        initialMap.put("k2", "v1");
        initialMap.put("k3", "v3");
        initialMap.put("k4", "v4");
        initialMap.put("k5", "v5");

        System.out.println(reversedValues(initialMap));
    }
}