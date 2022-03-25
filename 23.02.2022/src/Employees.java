	//Polymorphism
public class Employees extends Organization 
{
	double salary;         //variables
	static String OrgName;
	
	public Employees()     //constructor
	{
		salary=82000;
	}
	static					//blocks
	{
		OrgName="Tesla";
	}
	public void getInfo2() //methods
	{
		System.out.println(salary);
		System.out.println(OrgName);
	}
	public void getInfo() //overrides Organization.getInfo
	{
		System.out.println(Id);
		System.out.println(Name);
		System.out.println(salary);
		System.out.println(OrgName);
	}
	public static void main(String[] args) //main
	{
		Employees Emp=new Employees();     //object
		Emp.Id=3333;
		Emp.Name="Devi";
		Emp.getInfo();
		
		System.out.println("*************");
		Organization org=new Organization();
		org.getInfo();
		
	}

}
