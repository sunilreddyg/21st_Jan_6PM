package java1.Loops;

public class For_loop {

	public static void main(String[] args)
	{
		
		/*
		 * Forloop:-->
		 * Example:-->
		 * 		Print number from 1 to 20
		 */
		for (int i = 1; i <= 20; i++) 
		{
			System.out.println(i);
		}
		
		
		/*
		 * Exmaple:--> Conduct sub between 1 to 100
		 */
		int sum=0;
		for (int i = 1; i <=100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total value is => "+sum);
		
		
		//Runtime array
		String tools[]={"IDE","RC","WD","GRID","Appium"};
		//Example:--> Print all array values using for loop
		for (int i = 0; i < tools.length; i++) 
		{
			String toolname=tools[i];
			System.out.println("=> "+toolname);
			
		}
		
		
		

	}

}
