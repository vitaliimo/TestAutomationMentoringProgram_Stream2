package homework5.Ilona.Task4;

// Replace multipoint in the code so that after execution it will be – “Hello! Hello?"
public class Main {
    public static void main(String[] args) {
        StringFunction exclaim = (str) -> str + "!";
        StringFunction ask = (str) -> str + "?";
        printFormatted("Hello", exclaim);
        printFormatted(" Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.print(result);
    }
}