package sk.akademiasovy.geometry;

public class Triangle {

    private double a,b,c,s;

    public Triangle()
    {
        a=3;
        b=4;
        c=5;
    }

    public Triangle(double a, double b,double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }


public double getPerimeterOfTriangle()
    {
        return a+b+c;


    }


    public double getAreaOfTriangle()
    {

        s=getPerimeterOfTriangle()/2;

        return Math.sqrt(s*(s-a)*(s-b)*(s-c));

    }


    public boolean isRectangular()
    {
        if(a*a + b*b == c*c)
            return true;

            else if (a*a+c*c==b*b)
                return true;
        else if(b*b+c*c==a*a)
            return true;
        else
            return false;


    }

    public boolean existTriangle()
    {


    }

    public boolean isRovnoStranny()
    {


    }

    public  boolean isRovnoramenny()
    {


    }



}
