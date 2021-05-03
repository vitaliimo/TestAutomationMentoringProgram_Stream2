package homework3.Ilona.Task3;

/*
Напишите интерфейс Converter для конвертации из градусов Цельсия в Кельвины​и Фаренгейты.
У интерфейса Converter должен быть метод convert, который и делает конвертацию.
Создайте 2 класса: KelvinConverter, FahrenheitConverter которые реализуют метод convert под свою формулу
В  public static void main создайте 2 обьекта класса и сделайте конвертацию. Результат в консоль.
 */
public interface Converter {
    double convert(double valueToBeConverted);
}