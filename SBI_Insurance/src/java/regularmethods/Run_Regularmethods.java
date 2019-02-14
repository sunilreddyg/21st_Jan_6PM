package java.regularmethods;

public class Run_Regularmethods  //without static keyword
{

	public static void main(String[] args) 
	{
		
		/*
		 * Create object for class to call methos
		 * 	
		 * 		Classname obj=new Classname();
		 * 		obj.methoname();
		 */
		

		//Create object for class
		SmartPhone obj=new SmartPhone();
		obj.touch();
		obj.camera();
		obj.calculator();

	}

}
