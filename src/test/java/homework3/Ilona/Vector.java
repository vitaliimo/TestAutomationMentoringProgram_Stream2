package homework3.Ilona;

import java.util.Arrays;
import java.util.Random;

/*
Создайте класс, который описывает вектор (в трёхмерном пространстве).
У него должны быть:
- конструктор с параметрами в виде списка координат x, y, z
- метод, вычисляющий длину вектора sqrt(x^2 + y^2 + z^2). Корень можно посчитать с помощью Math.sqrt
- метод, вычисляющий скалярное произведение (x1*x2 + y1*y2 + z1*z2)
- статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
 */
public class Vector {
    private double x;
    private double y;
    private double z;

    // Constructor
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // The length of a vector
    public double calculateLengthVector(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    // Scalar product
    public double calculateScalarProduct(double x1, double x2, double y1, double y2, double z1, double z2) {
        return x1 * x2 + y1 * y2 + z1 * z2;
    }

    // Method to return an array of random vectors of N size
    static Vector[] randomVector(int n) {
        Vector[] vector = new Vector[n];
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            vector[i] = new Vector(random.nextDouble(), random.nextDouble(), random.nextDouble());
        }
        return vector;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomVector(7)));
    }
}