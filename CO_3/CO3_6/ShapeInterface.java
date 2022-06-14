/*Create an interface having prototypes of functions area() and perimeter(). Create two 
classes Circle and Rectangle which implements the above interface. Create a menu driven 
program to find area and perimeter of objects.*/

import java.util.Scanner;

interface maths
{
    public abstract double area();
    public abstract double perimeter();
    
}

class Circle implements maths
{
    double radius;
    Circle(Double r)
    {
        radius=r;
    }
    public double area()
    {
        return(3.14*radius*radius);
    }

    public double perimeter()
    {
        return(2*3.14*radius);
    }
}

class Rectangle implements maths
{
    double length,breadth;
    Rectangle(double l,double b)
    {
        length = l;
        breadth=b;
    }
    public double area()
    {
        return(length*breadth);
    }

    public double perimeter()
    {
        return(2*(length+breadth));
    }
}

class ShapeInterface
{
public static void main(String args[])
{
    int ch;
    double l,b,r;
    Scanner sc= new Scanner(System.in);
    //Circle cr = new Circle();
    System.out.println("Enter a choice:\n1:Area and perimeter of circle\n2:Area and perimeter of rectangle");
    ch = sc.nextInt();
    switch(ch)
    {
        case 1: System.out.println("Enter radius of circle to find its area and perimeter");
                r = sc.nextDouble();
                Circle cr = new Circle(r);
                System.out.println("Area of Circle:"+cr.area());
                
                System.out.println("Perimeter of Circle:"+cr.perimeter());
                
                break;

        case 2: System.out.println("Enter length and breadth of rectangle to find its area and perimeter");
                l = sc.nextDouble();
                b = sc.nextDouble();
                Rectangle rect = new Rectangle(l,b);
                System.out.println("Area of rectangle:"+rect.area());
                
                System.out.println("Perimeter of rectangle:"+rect.perimeter());
                
                break;

        default:System.out.println("Default case:Invalid input");
                break;
    }
}
}