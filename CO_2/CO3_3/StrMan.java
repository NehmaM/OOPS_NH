import java.util.Scanner;
import java.lang.*;
//Perform string manipulations
class StrMan{

    public static void main(String args[])
    {
        int ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st string");
        String str1=sc.nextLine();
        System.out.println("Enter 2nd string");
        String str2=sc.nextLine();
        System.out.println("Enter a choice");
        System.out.println("\n1:String concatenation\n2:length of string\n3:Index of a character 'e' in string\n4:Character at a position '2' in string\n5:Compare strings\n6:Check a string contains a sequence of characters\n7:exit");
        ch=sc.nextInt();
        while(true)
        {
        switch(ch)
        {
            case 1:System.out.println("\nString concatenation:"+str1.concat(str2));
                    break;

            case 2:System.out.println("\nlength of string 1:"+str1.length());
                    System.out.println("length of string 2:"+str2.length());
                    break;

            case 3: System.out.println("\nIndex of a character 'e' in string1:"+str1.indexOf('e'));
                    System.out.println("Index of a character 'e' in string2:"+str2.indexOf('e'));
                    break;

            case 4: System.out.println("\nCharacter at position 2 in string1:"+str1.charAt(2));
                    System.out.println("Character at position 2 in string2:"+str2.charAt(2));
                    break;

            case 5:System.out.println("Compare string1 with 'abc':"+str1.compareTo("abc"));
                System.out.println("Compare string2 with 'XYZ':"+str2.compareTo("XYZ"));
                System.out.println("Compare string1 with 'hello':"+str1.compareTo("hello"));
                break;

            case 6:System.out.println("contains 'he' string1:"+str1.contains("he"));
                    System.out.println("conatins 'ooo' string2:"+str2.contains("ooo"));
                    break;

            case 7:System.exit(0);
                    break;
                
            default: System.out.println("Default:invalid choice");
                        break;
                    
            

        }
        System.out.println("Enter a choice");
        System.out.println("\n1:String concatenation\n2:length of string\n3:Index of a character 'e' in string\n4:Character at a position '2' in string\n5:Compare strings\n6:Check a string contains a sequence of characters\n7:exit");
        ch=sc.nextInt();
    }
    }
}