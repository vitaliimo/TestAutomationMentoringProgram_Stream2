package homework4.Kateryna;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String text = "abcdefg";
        System.out.println(frequencyVocab(text));
    }
    public static Map<Character, Integer> frequencyVocab(String text) {
        Map<Character, Integer> vocab = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char key = text.charAt(i);
            Integer value = vocab.get(key);
            if (value != null) {
                vocab.put(key, new Integer(value + 1));
            } else {
                vocab.put(key, 1);
            }
        }
        return vocab;
    }
}
