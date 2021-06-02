package homework4.Ilona;

import java.util.*;

/* Написати метод, який приймає два масиви/списки елементів типу K, V (Generic) з різною кількістю елементів і повертає сортований Map<K, V>.
Варіант 1. Якщо масив K > V - то записати в value null, якщо масив K < V - зайві value не обробляти*/
public class Task5v1 {
    static Map moveListsToMap(List list1, List list2) {
        Map list3 = new TreeMap();
        Iterator<Integer> it1 = list1.iterator();
        Iterator<String> it2 = list2.iterator();
        if (list1.size() > list2.size()) {
            while (it1.hasNext()) {
                if (it2.hasNext()) {
                    list3.put(it1.next(), it2.next());
                } else {
                    list3.put(it1.next(), null);
                }
            }
        } else {
            while (it1.hasNext()) {
                list3.put(it1.next(), it2.next());
            }
        }
        return list3;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        //list2.add("four");
        //list2.add("five");

        System.out.println("Two lists are converted to Map: " + moveListsToMap(list1, list2));
    }
}