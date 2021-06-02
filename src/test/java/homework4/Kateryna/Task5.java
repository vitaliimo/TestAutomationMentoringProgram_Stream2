package homework4.Kateryna;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> elementsK = new ArrayList<>();
        elementsK.add(1);
        elementsK.add(2);
        elementsK.add(3);

        ArrayList<String> elementsV = new ArrayList<>();
        elementsV.add("apple");
        elementsV.add("pear");
        elementsV.add("banana");
        elementsV.add("orange");

        System.out.println(convertElementsToMap(elementsK, elementsV));
    }

    static Map<Integer, String> convertElementsToMap(List<Integer> elementsK, List<String> elementsV) {
        Map<Integer, String> resultMap = new HashMap<>();
        if (elementsK.size()< elementsV.size()) {
            for (int i = 0; i < elementsK.size(); i++) {
            resultMap.put(elementsK.get(i), elementsV.get(i));
            }
        }
        else {
            for (int i = 0; i < elementsV.size(); i++) {
                resultMap.put(elementsK.get(i), elementsV.get(i));
            }
            for (int i = elementsV.size(); i < elementsK.size(); i++) {
                resultMap.put(elementsK.get(i), null);
            }
        }
        return resultMap;
    }
}

