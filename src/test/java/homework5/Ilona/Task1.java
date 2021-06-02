package homework5.Ilona;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a Java program using ‘stream’ and ‘filter’ lambda function to get Collection which contains only words starts with ‘O’ character
public class Task1 {
    public static void main(String[] args) {
        List<String> elementsAsList = Arrays.asList(getTextFromFileAsString("src/test/java/homework5/Ilona/Text.txt").split(" "));
        System.out.println(elementsAsList.stream().filter(str -> str.startsWith("O")).collect(Collectors.toList()));
    }

    private static String getTextFromFileAsString(String fileName) {
        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}