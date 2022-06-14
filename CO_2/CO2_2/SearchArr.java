//Search an element in an array.
import java.util.*;
class SearchArr
{
    public static void main(String args[])
    {
        int n,ele,flag=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter total number of elements in an array");
        n=sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter "+n+" array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter an element to search in the array");
        ele= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(ele==arr[i])
            {
                    flag=1;
                    break;
            }
            
        }
        if(flag==1)
            System.out.println("Element"+ele+" found in array:");
        else
            System.out.println("Elemnet "+ele+" not found in array");


    }
}