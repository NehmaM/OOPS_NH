public class Employee
{
    int Empid;
    String Name;
    double Salary;
    String Address;

    Employee(int a,String b,double c,String d)
    {
        System.out.println("Parent class constructor");
         Empid = a;
         Name = b;
         Salary = c;
         Address = d;
    }
    void display()
    {
        System.out.println("Parent class display fn");
    }
}


