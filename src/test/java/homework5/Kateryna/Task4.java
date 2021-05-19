package homework5.Kateryna;

public class Task4 {

    interface StringFunction {
        String run(String str);
    }

    public class Main {
        public void main(String[] args) {
            StringFunction exclaim = (s) -> s + "!";
            StringFunction ask = (s) -> s + "?";
            printFormatted("Hello", exclaim);
            printFormatted("Hello", ask);
        }
        public void printFormatted(String str, StringFunction format) {
            String result = format.run(str);
            System.out.print(result);
        }
    }
}
