package test;

public class Eleven_ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int num=10;num>0;num--)
      {
    	  System.out.println(num);
	  }
      System.out.println("End of for loop");
      for(int num1=10;num1>0;num1-=2)
      {
    	  System.out.println(num1);
      }
      System.out.println("End of second for loop");
      //for loop array
      int[] arr1= {2,3,4,6,8,9};
      for(int i=0;i<arr1.length;i++)
      {
    	  System.out.println("Element value is"+arr1[i]);
      }
      //for each loop
      for(int val:arr1)
      {
    	  System.out.println("value is "+val);
      }
      String str1="Tim is from US";
      for(int i=0;i<str1.length();i++)
      {
    	  System.out.println("Char value is "+str1.charAt(i));
      }
	}
	
	}
