package homework1.Ilona;

// Write a Java program to find the duplicate values of an array of integer values
public class Task5 {
    public static void main(String[] args) {
        int[] myArr = {5, 6, 7, 12, -5, 32, 43, 6, 12};
        for (int i = 0; i < myArr.length; i++) {
            for (int j = i + 1; j < myArr.length; j++) {
                if (myArr[i] == myArr[j]) {
                    System.out.println(myArr[j]);
                }
            }
        }

    }
}