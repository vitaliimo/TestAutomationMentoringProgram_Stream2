package homework3.Ilona.Task3;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double valueToBeConverted = -22;

        FahrenheitConverter fahrenheit = new FahrenheitConverter();
        KelvinConverter kelvin = new KelvinConverter();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Converted temperature = " + decimalFormat.format(fahrenheit.convert(valueToBeConverted)) + "°F");
        System.out.println("Converted temperature = " + decimalFormat.format(kelvin.convert(valueToBeConverted)) + "K");
    }
}