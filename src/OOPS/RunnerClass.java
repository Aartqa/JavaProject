package OOPS;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1= new Employee();
		emp1.Name="Aarthi";
		emp1.EmpId=1000;
		emp1.DisplayName();
		Employee emp2=new Employee();
		emp2.Name="Rakshi";
		emp2.EmpId=1001;
		emp2.DisplayName();
		Employee emp3=new Employee("Ranjith",1002); //parameterized constructor
        emp3.DisplayName();
        Employee.DisplaySalary();
        
        Inheritance_Citizen ct1=new Inheritance_Citizen();
        ct1.age=50;
        ct1.Name="Pavi";
        ct1.SSN=12345;
        
	}

}
