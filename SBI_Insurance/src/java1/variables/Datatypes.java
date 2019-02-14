package java1.variables;

public class Datatypes 
{

	public static void main(String[] args) 
	{
		
		/*
		 * int:-->  Numeric datatype
		 * 		   => default value is zero
		 */
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println("total is "+c);
		
		
		/*
		 * boolean:--> boolean accept true/false.
		 * 			   default value is false.
		 * 			
		 */
		boolean flag=true;
		System.out.println("status is => "+flag);
		
		
		/*
		 * String:-->
		 * 			=> Allow set of characters to store
		 * 			=> String a non primitive datatype
		 * 			=> Default value is null
		 */
		String name="MQ-DSNR";
		String email="info.dsnr@mindqsystems.com";
		String mobile="9030248855";
		
		System.out.println(name+"\t"+email+"\t"+mobile);
		
		
	}

}
