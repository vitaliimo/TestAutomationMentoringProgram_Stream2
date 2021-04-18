package homework1.Ilona;

// Write a Java program to print the sum of two numbers
public class Task1 {
    public static void main(String[] args) {
        way1();
        way2();
        System.out.println(way3(74, 36));
    }

    // The 1st approach to print the sum of two numbers
    public static void way1() {
        System.out.println(74 + 36);
    }

    // The 2nd approach to print the sum of two numbers
    public static void way2() {
        int a = 74, b = 36;
        System.out.println(a + b);
    }

    // The 3rd approach to print the sum of two numbers
    public static int way3(int a, int b) {
        return a + b;
    }
}
