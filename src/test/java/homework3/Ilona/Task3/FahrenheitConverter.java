package homework3.Ilona.Task3;

public class FahrenheitConverter implements Converter {
    @Override
    public double convert(double valueToBeConverted) {
        return valueToBeConverted * 1.8 + 32;
    }
}