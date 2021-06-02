package homework5.Ilona;

import java.util.Arrays;
import java.util.LinkedList;

/* What's wrong with the following code? Fix the code
public static void main(String[] args) {
        LinkedList<Boolean> childrenAges = new LinkedList<>(Arrays.asList(2, 4, 5, 7));
        childrenAges.forEach( a <- (age) -> System.out.println("One of the children is " + age + " years old."));
        }*/

public class Task6 {
    public static void main(String[] args) {
        LinkedList<Integer> childrenAges = new LinkedList<>(Arrays.asList(2, 4, 5, 7));
        childrenAges.forEach((age) -> System.out.println("One of the children is " + age + " years old."));
    }
}

/* 1. Incorrect type of LinkedList<Boolean> --> <Integer>
2. Incorrect syntax of lambda "a <- (age) ->" --> "(age) ->"
 */