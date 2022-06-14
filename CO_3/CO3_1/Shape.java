import java.util.Scanner;

class Shape
{
        public double area(double r)
        {
                return(3.14*r*r);
        }
        public int area(int l,int b)
        {
                return(l*b);
        }
        public double area(Double b,Double h)
        {
                return(0.5*b*h);
        }

        public static void main(String args[])
        {
                double radius,height,base;
                int length,breadth;
                Shape sh = new Shape();
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter radius of circle");
                radius = sc.nextDouble();
                System.out.println("Area of circle="+sh.area(radius));

                System.out.println("Enter length and breadth of rectangle");
                length = sc.nextInt();
                breadth = sc.nextInt();
                System.out.println("Area of rectangle="+sh.area(length,breadth));

                System.out.println("Enter base and height of triangle");
                base = sc.nextDouble();
                height = sc.nextDouble();
                System.out.println("Area of triangle="+sh.area(base,height));
                //Scanner.close();
        }
    }