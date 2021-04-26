package homework2.Ilona;


import java.awt.*;

// What's wrong with the following program? Fix the program called SomethingIsWrong.
public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + area(myRect.width, myRect.height));
    }

    static int area(int width, int height) {
        return width * height;
    }
}