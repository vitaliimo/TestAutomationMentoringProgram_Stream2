package homework5.Kateryna;

import java.util.Arrays;
import java.util.LinkedList;

public class Task6 {
    public static void main(String[] args) {

        LinkedList<Integer> childrenAges = new LinkedList<>(Arrays.asList(2, 4, 5, 7));
        Object oneAge = childrenAges.get(0);
        System.out.println("One of the children is " + oneAge + " years old.");
    }
}
