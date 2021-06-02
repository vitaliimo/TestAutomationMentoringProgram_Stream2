package homework4.Ilona;

import java.util.*;

//Написати метод, який на вхід приймає колекцію обєктів V (Generic), в якій є дублюючі об’єкти, а повертає колекцію V вже без дублікатів.
public class Task2 {
    static Set removeDuplicates(List inputObj) {
        return new HashSet(inputObj);
    }

    public static void main(String[] args) {
        ArrayList<Integer> inputObj1 = new ArrayList<Integer>();
        inputObj1.add(10);
        inputObj1.add(12);
        inputObj1.add(10);
        inputObj1.add(1);
        inputObj1.add(12);
        inputObj1.add(8);

        LinkedList<String> inputObj2 = new LinkedList<String>();
        inputObj2.add("Cat");
        inputObj2.add("Dog");
        inputObj2.add("Rabbit");
        inputObj2.add("Cat");
        inputObj2.add("Rabbit");
        inputObj2.add("Dog");

        System.out.println("List without duplicates: " + removeDuplicates(inputObj1));
        System.out.println("List without duplicates: " + removeDuplicates(inputObj2));
    }
}