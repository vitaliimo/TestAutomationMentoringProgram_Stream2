package homework1.Ilona;

//  Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
public class Task3 {
    public static void main(String[] args) {
        sum();
        subtract();
        multiply();
        divide();
        mod();
    }

    // Create a separate method for each operation
    public static void sum() {
        System.out.println(125 + 24);
    }

    public static void subtract() {
        System.out.println(125 - 24);
    }

    public static void multiply() {
        System.out.println(125 * 24);
    }

    public static void divide() {
        System.out.println(125 / 24);
    }

    public static void mod() {
        System.out.println(125 % 24);
    }
}