class EmployeePerson extends Person
{
    int Empid;
    String Company_name;
    String Qualification;
    double Salary;

    EmployeePerson(String a,String b,String c,int d,int eid,String cname,String quali,double sal)
    {
        super(a,b,c,d);
        Empid=eid;
        Company_name = cname;
        Qualification = quali;
        Salary = sal;
    }
}