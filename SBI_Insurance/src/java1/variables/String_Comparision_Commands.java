package java1.variables;

public class String_Comparision_Commands 
{

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 			=> Allow set of characters to store
		 * 			=> Defult value is null.
		 * 			=> String also called as CLASS, Because
		 * 				string contain set of events to validate
		 * 				behaviour of stored characters.
		 */
		
		
		/*
		 * Equals:-->
		 * 			This method verify equal comparision between
		 * 			two strings and return boolean value true/false;
		 */
		 String exp_result="Account Created";
		 String act_result="account created";
		
		boolean flag=act_result.equals(exp_result);
		System.out.println("equal comparision is => "+flag);
		
		/*
		 * EqualIgnorecase:-->
		 * 			method verify equalingore case comparision between
		 * 		    two strings and return boolean value true/false
		 */
		boolean flag1=act_result.equalsIgnoreCase(exp_result);
		System.out.println("equalignorecase comparision is => "+flag1);
		
		
		/*
		 * contains:-->
		 * 		Method verify sub string available at main string
		 * 		and return boolean value true/false.
		 */
		String productname="Redmi Note 6 Pro (Black, 64 GB)";
		boolean flag2=productname.contains("Black");
		System.out.println("subString available status is =. "+flag2);
		
		
		/*
		 * SubString:-->
		 * 		Method capture subString characters from mainString
		 * 		using begin and end index numbers.
		 */
		String Mobile_number="9030248855";
		
		//capture last 5 digit numbers
		String Last_digit_num=Mobile_number.substring(5);
		System.out.println("Last 5 digit numbers are => "+Last_digit_num);
		
		//capture middle characters
		String Mobile_middle_num=Mobile_number.substring(2, 8);
		System.out.println("middle characters available is => "+Mobile_middle_num);
		
		
		/*
		 * length:-->
		 * 		Method verify length of characters and return
		 * 		int value.
		 */
		String Mobile="9030248855";
		int len=Mobile.length();
		System.out.println("Mobile number length is => "+len);
		
		
		/*
		 * trim:-->
		 * 		method trim extra spaces at characters
		 */
		 String pincode="  5050061  ";
		 System.out.println("before trim length of pincode is => "+pincode.length());
		//trim extra spaces
		 String new_pincode=pincode.trim();
		 System.out.println("After trim length of pincode is => "+new_pincode.length());
		 
		 
		 /*
		  * isEmpty:-->
		  * 		method return empty status of string
		  */
		 String var1="";
		 String var2="MQ";
		 
		 System.out.println("var1 empty status is => "+var1.isEmpty());
		 System.out.println("var2 empty status is => "+var2.isEmpty());
		 
		 
		 /*
		  * StartsWith:-->
		  * 		Method verify characters in string started with
		  * 		expected characters.
		  */
		 String IFSC_Code="HDFC000012";
		 boolean flag3=IFSC_Code.startsWith("HDFC");
		 System.out.println("IFSC code start with status is => "+flag3);
	}

}
