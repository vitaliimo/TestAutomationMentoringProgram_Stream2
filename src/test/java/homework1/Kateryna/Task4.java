package homework1.Kateryna;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 12, -5, 32, 43};
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);
    }
}
