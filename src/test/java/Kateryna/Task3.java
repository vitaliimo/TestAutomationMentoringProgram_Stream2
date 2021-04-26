package Kateryna;

import java.awt.*;

// об'єкт Rectangle оголошено, але не створено

public class Task3 {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(1,2,40,50);
        double area;
        double width;
        double height;
        width = myRect.getWidth();
        height = myRect.getHeight();
        area = width * height;
        System.out.println("myRect's area is " + area);
    }
}
