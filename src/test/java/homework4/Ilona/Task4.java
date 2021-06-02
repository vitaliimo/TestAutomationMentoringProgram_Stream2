package homework4.Ilona;

import java.util.*;

/* Створити String масив з замовленнями (з дублюючими замовленнями), які прийшли в інтернет магазин.
Створити два види колекцій HashSet та TreeSet, в які потрібно добавлятись наші замовлення.
Вевести на екран список з HashSet та з TreeSet окремо один від одного.
*Зробіть не менше 5 замовлень.*/
public class Task4 {
    static Set moveToHashSet(String[] inputOrders) {
        List<String> ordersList = Arrays.asList(inputOrders);
        return new HashSet(ordersList);
    }

    static Set moveToTreeSet(String[] inputOrders) {
        List<String> ordersList = Arrays.asList(inputOrders);
        return new TreeSet(ordersList);
    }

    public static void main(String[] args) {
        String[] orders = new String[]{"order1", "order2", "order1", "order2", "order3"};

        System.out.println("HashSet List: " + moveToHashSet(orders));
        System.out.println("TreeSet List: " + moveToTreeSet(orders));
    }
}