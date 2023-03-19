package test;

public class Seven_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {10,20,30,40,50};
		System.out.println("Length of the array is:"+arr1.length);
        System.out.println("First value inside the array is: "+arr1[0]);   
        System.out.println("Last value inside the array is: "+arr1[arr1.length-1]);   
        //String array
        String[] arr2= {"Mon","Tue","Wed","Thu","Fri"};
        System.out.println("Value at third position is "+arr2[2]);
        String str="Clean world Green World";
        String[] arr3=str.split(" ");//{"clean","world","green","world"}
        System.out.println("Total num of words inside the string is "+arr3.length);
	    //invalide: we need to use loopsSystem.out.println("All the values inside arr1 "arr1);
	}
	

}
