public class Teacher extends Employee{
    String department;
    String subject;

    Teacher(int a,String b,double c,String d,String dep,String sub)
    {
        super(a,b,c,d);
        System.out.println("child class constructor");
        department=dep;
        subject=sub;
    }

    void display()
    {
        System.out.println("Details of Employee:");
        System.out.println("Empid: "+Empid);
        System.out.println("Name:"+Name);
        System.out.println("Salary:"+Salary);
        System.out.println("Address:"+Address);
        System.out.println("Address:"+Address);
        System.out.println("department:"+department);
        System.out.println("subject:"+subject);
        super.display();
    }
}