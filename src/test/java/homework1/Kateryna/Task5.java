package homework1.Kateryna;

public class Task5 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 6, 7, 12, -5, 32, 43, 6, 12};
        for (int j = 0; j < arr1.length; j++)
            for (int k = j+1; k < arr1.length; k++)
                if (arr1[j] == arr1[k]) {
                    int dup1 = arr1[j];
                    System.out.println(dup1);
                }
    }
}
