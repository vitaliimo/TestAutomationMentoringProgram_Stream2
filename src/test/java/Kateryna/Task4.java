package Kateryna;

public class Task4 {
    public static void main(String[] args) {

        NumberHolder BlueHouse = new NumberHolder(5, 2.75f);
    }

    public static class NumberHolder {
        public int aInt;
        public float aFloat;

        public NumberHolder(int aInt, float aFloat) {
            super();
            this.aInt = aInt;
            this.aFloat = aFloat;

            System.out.println(this.aInt);
            System.out.println(this.aFloat);
        }
    }
}
