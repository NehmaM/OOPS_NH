import java.util.*;
public class ShapeOverload
{
   public double area(double x)
     {
        return(3.14*x*x);
     }
   public double area(double x,double y)
     {
        return(x*y);
      }
public static void main(String args[])
{
ShapeOverload obj=new ShapeOverload();
Scanner s=new Scanner(System.in);
System.out.println("Enter the values:");
double x = s.nextDouble();
double y = s.nextDouble();
System.out.println("Area of circle is:"+obj.area(x));
System.out.println("Area of rectangle is:"+obj.area(x,y));
   }
}
