/*Create a class ‘Employee’ with data members Empid, Name, Salary, Address and 
constructors to initialize the data members. Create another class ‘Teacher’ that inherit the 
properties of class employee and contain its own data members department, Subjects taught 
and constructors to initialize these data members and also include display function to 
display all the data members. Use array of objects to display details of N teachers.*/
import java.util.*;
public class CO3_2{

    
public static void main(String args[])
{
    //Teacher th = new Teacher(123,"abc",34000.0,"xxxxxx","mca","maths");
    //System.out.println("Enter n ");
    //Scanner sc=new Scanner(System.in);
    //n=sc.nextInt();
    Teacher obj[] = new Teacher[2];
    obj[0]=new Teacher(123,"abc",34000.0,"xxxxxx","mca","maths");
    obj[1]=new Teacher(456,"efg",35000.0,"yyyyyy","mca","eng");

    obj[0].display();
    obj[1].display();

}

}


