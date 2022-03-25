	//Encapsulation
public class Customer 
{
	int CustomerId; 		//variables
	String CustomerName;
	static String ShopName;
	
	public Customer() 		//construtors
	{ 
		CustomerId=5333;
		CustomerName="Jai";
	}
	static 					//blocks
	{
		ShopName="Amazon";
	}
	public void getCustomerInfo() 				//methods
	{
	System.out.println("***Customer details***");
	System.out.println("Customer Id : "+CustomerId);
	System.out.println("Customer Name : "+CustomerName);
	System.out.println("Shop Name : " +ShopName);
	}
	public static void main(String[] args) 		//main()
	{
		Customer customer=new Customer(); 		//objects
		customer.getCustomerInfo();
		
	}

}
