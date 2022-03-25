		//Inheritance
public class Employee extends Organization
{
	double salary;
	static String orgName;
	
	public Employee()
	{
		
	}
	static
	{
		orgName="Tesla";
	}
	public void getEmployeeInfo()
	{	
		System.out.println(Id);
		System.out.println(Name);
		System.out.println(salary);
		System.out.println(orgName);
	}
	public static void main(String[] args)
	{
		Employee employee=new Employee();
		employee.Id=6554;
		employee.Name="Shiva";
		employee.salary=76995.87;
		employee.getEmployeeInfo();
		System.out.println("*******************");
		
		Employee employee1=new Employee();
		employee1.Id=5656;
		employee1.Name="Arun";
		employee1.salary=65595.87;
		employee1.getEmployeeInfo();
		 System.out.println("*******************");
		 
		 Employee employee2=new Employee();
			employee2.Id=7774;
			employee2.Name="Tarun";
			employee2.salary=55995.87;
			
			employee2.getEmployeeInfo();
			 System.out.println("*******************");
		 
		 
		 
	}
}
