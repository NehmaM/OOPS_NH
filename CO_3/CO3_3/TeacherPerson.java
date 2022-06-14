class TeacherPerson extends EmployeePerson
{
    String Subject; 
    String Department;
    int Teacherid;

    TeacherPerson(String a,String b,String c,int d,int eid,String cname,String quali,double sal,String sub,String dpt,int tid)
    {
        super(a,b,c,d,eid,cname,quali,sal);
        this.Subject = sub;
        this.Department = dpt;
        this.Teacherid = tid;
    }

    void display()
    {
        System.out.println("Details of Person:");
        System.out.println("Name:"+Name);
        System.out.println("Gender:"+Gender);
        System.out.println("Address:"+Address);
        System.out.println("Age:"+Age);

        System.out.println("Details of Employee:");
        System.out.println("employee id:"+Empid);
        System.out.println("company name:"+Company_name);
        System.out.println("Qualification:"+Qualification);
        System.out.println("salary:"+Salary);

        System.out.println("Details of Teacher:");
        System.out.println("department:"+Department);
        System.out.println("subject:"+Subject);
        System.out.println("TeacherId:"+Teacherid);

    }
}