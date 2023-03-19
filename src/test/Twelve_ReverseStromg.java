package test;

public class Twelve_ReverseStromg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str1="Hello World";
     String result="";
     for(int i=str1.length()-1;i>=0;i--)
     {
    	result=result+str1.charAt(i); 
     }
     System.out.println("Reversed String is "+result);
	}

}
