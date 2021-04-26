package homework2.Ilona;

/* Given the following class, called NumberHolder, write some code that creates an instance of the class,
initializes its two member variables, and then displays the value of each member variable */
public class Task4 {
    public static void main(String[] args) {
        NumberHolder number = new NumberHolder(100, 100.5f);

        System.out.println("Integer value: " + number.anInt);
        System.out.println("Float value: " + number.aFloat);
    }

    public static class NumberHolder {
        public int anInt;
        public float aFloat;

        public NumberHolder(int anInt, float aFloat) {
            this.anInt = anInt;
            this.aFloat = aFloat;
        }
    }
}


