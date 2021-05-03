package homework3.Ilona.Task3;

public class KelvinConverter implements Converter {
    @Override
    public double convert(double valueToBeConverted) {
        return valueToBeConverted + 273.15;
    }
}