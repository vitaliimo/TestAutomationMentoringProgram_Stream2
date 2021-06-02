package homework4.Ilona;

import java.util.Map;
import java.util.TreeMap;

//Побудувати частотний словник букв алфавіту. Створити метод, який приймає текст і повертає словник, в якому міститься символ і його кількість.
public class Task1 {
    static Map countFrequencyOfCharacters(String abc) {
        char[] abcArray = abc.toCharArray();
        Map<String, Integer> map = new TreeMap<String, Integer>();
        for (int i = 0; i < abcArray.length; i++) {
            int y = 0;
            for (int j = 0; j < abcArray.length; j++) {
                if (abcArray[i] == abcArray[j]) {
                    y++;
                }
            }
            map.put(String.valueOf(abcArray[i]), y);
        }
        return map;
    }

    public static void main(String[] args) {
        String abc = "once upon a time...";
        System.out.println(countFrequencyOfCharacters(abc));
    }
}