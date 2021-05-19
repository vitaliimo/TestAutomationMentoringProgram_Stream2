package homework2.Kateryna;

public class Task4 {
    public static void main(String[] args) {
        NumberHolder BlueHouse = new NumberHolder(5, 2.75f);
        System.out.println(BlueHouse);
    }
    public static class NumberHolder {
        private int aInt;
        private float aFloat;
        public NumberHolder(int aInt, float aFloat) {
            this.aInt = aInt;
            this.aFloat = aFloat;
        }
        @Override
        public String toString() {
            return "The house has " + aInt + " rooms and " + aFloat + "-meter high walls";
        }
    }
}