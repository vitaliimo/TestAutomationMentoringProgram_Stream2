package homework2.Ilona;

// Write a Java program to concatenate a given string to the end of another string. And remove all `P` or `p` characters.
public class Task1 {
    public static void main(String[] args) {
        String a1 = "PHP Exercises and";
        String a2 = " Python Exercises";
        method1(a1, a2);
        method2(a1, a2);
    }

    // using "+"
    public static void method1(String a1, String a2) {
        System.out.println((a1 + a2).replace("P", ""));
    }

    // using existing concat() method
    public static void method2(String a1, String a2) {
        System.out.println((a1.concat(a2)).replace("P", ""));
    }
}

