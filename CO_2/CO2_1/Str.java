//Program to Sort strings 
import java.util.Scanner;
import java.util.Arrays;

class Str{

    public static String strSort(String s)
    {
        char temparray[] = s.toCharArray();
        Arrays.sort(temparray);
        return new String(temparray);
    }

    public static void main(String args[])
    {
        String s,outStr;
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        s = sc.nextLine();
        outStr = strSort(s);
        System.out.println("Input string:"+s);
        System.out.println("Output string:"+outStr);


    }

}
/* 
class Str{

    public static void main(String args[])
    {
        String s;
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        s = sc.nextLine();
        char ch[]=s.toCharArray();
        char temp=0;
        int j=0;
        int i;
        for(i=0;i<ch.length;i++)
        {
            for(j=0;j<ch.length;j++)
            {
                    if(ch[j]>ch[i])
                    {
                        temp = ch[i];
                        ch[i]=ch[j];
                        ch[j]=temp;
                    }
            }
        }

        System.out.println("Sorted string:");
        for(i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);

        }

    }
}

*/






/*class Str
{
    public static void main(String args[])
    {
        String n;
        //Str s1=new str();
        System.out.println("Enter a string");
        Scanner sc= new Scanner(System.in);
        n = sc.nextLine();
        char arr[]=new char[n.length()];

        for(int i=0;i<n.length();i++)
        {
            arr[i] = n.charAt(i);
        }
        for (char i : arr)
        {
            System.out.println(i);
        }
    }
}*/

