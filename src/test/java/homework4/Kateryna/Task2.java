package homework4.Kateryna;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    static Set noDuplicates (List numberList) {
        return new HashSet(numberList);
    }
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(3);
        numberList.add(2);
        numberList.add(3);
        System.out.println(noDuplicates(numberList));

//OR
        Set<Integer> noDuplicates2 = new HashSet<>(numberList);
        numberList.clear();
        numberList.addAll(noDuplicates2);
        System.out.println(noDuplicates2);
    }
}
