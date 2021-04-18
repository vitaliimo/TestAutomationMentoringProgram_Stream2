package homework1.Ilona;

// Write a Java program to sum values of an array
public class Task4 {
    public static void main(String[] args) {
        int[] myArr = {5, 6, 7, 12, -5, 32, 43};
        System.out.println(sum1(myArr));
        System.out.println(sum2(myArr));

    }

    // Calculate the sum of an array using "for" loop
    public static int sum1(int[] myArr) {
        int result = 0;
        for (int index = 0; index < myArr.length; index++) {
            result += myArr[index];
        }
        return result;
    }

    //   Calculate the sum of an array using "while" loop
    public static int sum2(int[] myArr) {
        int result = 0;
        int index = 0;
        while (index < myArr.length) {
            result += myArr[index];
            index++;
        }
        return result;
    }
}