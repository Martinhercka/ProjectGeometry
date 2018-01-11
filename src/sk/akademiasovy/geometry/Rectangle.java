package sk.akademiasovy.geometry;

public class Rectangle
{
    private double a;
    private double b;



    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle()
    {
        a=0;
        b=0;

    }

    public double getAreaofRectangle()
    {
        return a*b;

    }

    public double getPerimeterOfRectangle()
    {
        return 2*(a+b);

    }
    public void transpose()
    {
        double temp;
        temp=a;
        a=b;
        b=temp;



    }







}


