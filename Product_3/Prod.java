//class product- data members :pcode,pname,price 3 obj-find pdt having lowest price.

class Product
{
	int pcode;
	String pname;
	int price;

	Product(int a,String b,int c)
	{
		pcode=a;
		pname=b;
		price=c;
	}
	
}

class Prod
{
	public static void main(String args[])
	{
		int low;
		Product pdt1=new Product(11,"Harry",20);
		Product pdt2=new Product(12,"Zoya",30);
		Product pdt3=new Product(13,"Zain",100);

		low=pdt1.price;
		for(int i=1;i<=3;i++)
		{
			if(pdt2.price<low)
				low=pdt2.price;
			else if(pdt3.price<low)
				low=pdt3.price;
				
		}
		System.out.println("\nLowest price ="+low);
	}
	
}
