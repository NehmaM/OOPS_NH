class Rectangle
{
	int length,breadth;
	Rectangle()
	{
		length=20;
		breadth=10;
	}

	Rectangle(int a,int b)
	{
		length=a;
		breadth=b;
	}
	int RectPeri()
	{
		return(length*breadth);
	}
}

class PeriRect
{
	public static void main(String args[])
	{
		int peri1,peri2;
		Rectangle rect1=new Rectangle();
		Rectangle rect2=new Rectangle(30,20);

		peri1=rect1.length*rect1.breadth;
		System.out.println("\nPerimeter1="+peri1);
		peri2=rect2.RectPeri();
		System.out.println("\nPerimeter2="+peri2);
	}

}
