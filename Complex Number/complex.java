import java.util.Scanner;

class complex
{
	public static void main(String args[])
	{
		int n,r1,i1,r2,i2,r3,i3;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the real part of 1st complex number");
		r1=sc.nextInt();
		System.out.println("\nEnter the imaginary part of 1st complex number");
		i1=sc.nextInt();

		System.out.println("\nEnter the real part of 2nd complex number");
		r2=sc.nextInt();
		System.out.println("\nEnter the imaginary part of 2nd complex number");
		i2=sc.nextInt();

		
		System.out.println("\nAfter addition");
		r3=r1+r2;
		i3=i1+i2;
		System.out.println(r3+"+"+i3+"i");
	}
}
