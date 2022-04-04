
import java.util.Scanner;
/*
class Addition
{
	int addMatrix(int a[][],int b[][])
	{
		for(int i=0;i<)
	}
}

*/


class matrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//Addition ad1=new Addition();
		int size;
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		System.out.println("Enter size of matrices to perform addition");
		size=sc.nextInt();
		System.out.println("Enter the elements of the array1: ");  
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
				a[i][j]=sc.nextInt();
		}

		System.out.println("Enter the elements of the array2: ");  
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
				b[i][j]=sc.nextInt();
		}

		System.out.println("1st array: ");  
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(a[i][j]+" "); 
			}
			System.out.println();
		}

		System.out.println("2nd array: ");  

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(b[i][j]+" "); 
			}
			System.out.println();
		}
		
		//ad1.addMatrix(a,b);

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
			System.out.println();
		}
		
		System.out.println("\nAfter addition");

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(c[i][j]+" "); 
			}
			System.out.println();
		}
	}
}
