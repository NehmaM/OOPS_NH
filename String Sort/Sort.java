
import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

public class Sort {
	
	public static String sortString(String inputString)
	{

		char tempArray[] = inputString.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter input String");
		String str = sc.nextLine();
		String sortStr = sortString(str);
		System.out.println("Input String : " + str);
		System.out.println("Output String : "+ sortStr);
	}
}

/*import java.io.*;
import java.util.Arrays;

class Sort
{
	public static void main(String args[]) throws Exception
	{
		String str1="dbzcan";
		char temp;
		char arr[]=str1.toCharArray();
		
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=0;j<=arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}	
		
		System.out.println(arr);
	}
}
*/


