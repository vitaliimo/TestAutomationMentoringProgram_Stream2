package homework4.Kateryna;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        String[] orders = new String[] {"books", "groceries", "books", "clothes", "groceries", "shoes"};
        System.out.println(applyHashSet(orders));
        System.out.println(applyTreeSet(orders));
    }
    static Set applyHashSet(String[] orders) {
        List<String> ordersList = Arrays.asList(orders);
        return new HashSet(ordersList);
    }
    static Set applyTreeSet(String[] orders) {
        List<String> ordersList = Arrays.asList(orders);
        return new TreeSet(ordersList);
    }
}
