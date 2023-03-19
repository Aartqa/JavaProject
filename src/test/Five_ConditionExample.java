package test;

public class Five_ConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=1;
		if(age>30 && age>18)
		{
			System.out.println("Am not eligible to write bank exam");
		}
		else if(age==30)
		{
			System.out.println("Am eligible to write the bank exams only this year");
		}
		else
		{
			System.out.println("you are eligible");
		}

	}

}
