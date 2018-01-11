package sk.akademiasovy.main;

import org.w3c.dom.css.Rect;
import sk.akademiasovy.geometry.Square;
import sk.akademiasovy.geometry.Rectangle;

public class Main
{
    public static void main(String[] args)
    {
        Square square1 = new Square(7.5);
        Square square2 = new Square();

        System.out.println("Area of square1 is: "+square1.getArea());
        System.out.println("Perimeter of square1 is: "+square1.getPerimeter());
        System.out.println("Diagonal of square1 is: "+square1.getDiagonal());

        Rectangle rectangle1 = new Rectangle(7.5,8.5);

        System.out.println("Area of rectangle is: "+rectangle1.getAreaofRectangle());
        System.out.println("Perimeter of rectangle is: "+rectangle1.getPerimeterOfRectangle());



    }
}
