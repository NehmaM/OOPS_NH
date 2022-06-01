import java.util.*;

interface Shape
{
	final double pi = 3.14;
	void area();
	void peri();
	void input();
}

class Circle implements Shape
{
	int r;
	double area,peri;

	public void input()
	{
			System.out.println("Enter radius of circle:");	
		Scanner sc=new Scanner(System.in);
		r = sc.nextInt();
	}
	public void area()
	{
		area = pi*r*r;
		System.out.println("\nArea of circle:"+area);
	}

	public void peri()
	{
		peri = 2*pi*r;
		System.out.println("\nPerimeter of circle:"+peri);
	}
}

/*class rectangle implements Shape
{
	int rad;
	
}*/
