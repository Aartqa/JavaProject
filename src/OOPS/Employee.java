package OOPS;

public class Employee {
	
	public String Name;
	public int EmpId;
	private static int Salary=5000;//static mean salary common for all salary
	
	public Employee()
	{
		System.out.println("Inside Default Constructor");
	}
	public Employee(String var1, int var2)
	{
		System.out.println("Inside parameterized Constructor");
		Name=var1;
		EmpId=var2;
	}
	public void DisplayName()
	{
		System.out.println("Name of the Employee is " +Name);
		
	}
	public static void DisplaySalary()
	{
		System.out.println("Salary of the Employee is" +Salary);
	}
	


}
