package test;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
		if(age<17) {
		System.out.println("You are not eligible for voting");
		
		} else if(age==17)
		{ 
			System.out.println("You will be eligible for voting next year");
		}
		else
		System.out.println("You are eligible for voting");
	}
}
