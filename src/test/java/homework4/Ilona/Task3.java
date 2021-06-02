package homework4.Ilona;

import java.util.*;

/*Написати метод, який приймає Map<K, V> і повертає Map, де ключі і значення замінені місцями.
Так як значення можуть бути не унікальними, то тип значення в Map буде вже не K, а Collection<K>:Map<V, Collection<K>> */
public class Task3 {
    static Map<String, List<String>> reverseKeyValue(Map<String, String> map) {
        Map<String, List<String>> reverseMap = new HashMap<String, List<String>>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String oldValue = entry.getValue();
            String oldKey = entry.getKey();
            List<String> newValue;
            if (reverseMap.containsKey(oldValue)) {
                newValue = reverseMap.get(oldValue);
            } else {
                newValue = new LinkedList<>();
            }
            newValue.add(oldKey);
            reverseMap.put(oldValue, newValue);
        }
        return reverseMap;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v1");

        System.out.println("Reversed Map: " + reverseKeyValue(map));
    }
}