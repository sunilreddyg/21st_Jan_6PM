package java1.Arrays;

public class Array_Syntax 
{

	public static void main(String[] args) 
	{
		/*
		 * Array:-->	
		 * 			Array store collection of similar events.
		 * 
		 * 			Static Array
		 * 			Runtime Array
		 */
		
		
		/*
		 * static Array:-->
		 * 			Static array allow to store specific boundary data.
		 */
		String arr[]=new String[3];
		arr[0]="firefox";
		arr[1]="chrome";
		arr[2]="safari";
		
		System.out.println("first index value is "+arr[1]);
		
		
		
		/*
		 * RuntimeArray:-->
		 * 		It store dynamic data
		 * 		No need to specify boundary range
		 */
		String tools[]={"IDE","RC","WD","GRID","Appium"};
		System.out.println("2nd index value is => "+tools[2]);
		
		
		
		/*
		 * Double dimension array:-->
		 * 		Double dimension array store data in tabler format.
		 */
		
		//static double dimension  array
		String data[][]=new String[3][2];
		//1st row data
		data[0][0]="user1";
		data[0][1]="pwd1";
		
		data[1][0]="user2";
		data[1][1]="pwd2";
		
		data[2][0]="user3";
		data[2][1]="pwd3";
		
		
		
		//Runtime double dimension array
		String mobileinfo[][]=
			{
					{"9030248855","Airtel"},
					{"9030848855","Tata Docomo"},
					{"9440098545","BSNL"},
			};
		
		
		
	}

}
