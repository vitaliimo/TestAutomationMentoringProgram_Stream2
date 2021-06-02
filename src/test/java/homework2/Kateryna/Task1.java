package homework2.Kateryna;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";
        String str3 = str1 + str2;
//        String str4 = str3.replaceAll("[p, P]", " ");
//        System.out.println(str4);
// OR
        char[] strInChar = str3.toCharArray();
        for (int i = 0; i<str3.length(); i++) {
            if (strInChar[i] == 'P') {
                strInChar[i] = ' ';
            }
        }
        String textWithoutP = String.valueOf(strInChar);
        System.out.println(textWithoutP);
    }
}