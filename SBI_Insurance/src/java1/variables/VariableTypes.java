package java1.variables;

public class VariableTypes 
{
	int b=200;   //Instant variable
	static int c=300;   //Class variable
	
	public void method1()
	{
		int a=100;   //Local variable
		System.out.println("local variable is => "+a);
	}
	
	public void method2()
	{
		System.out.println("instant variable is => "+b);
	}
	
	
	public static void main(String args[])
	{
		
		/*
		 * To Access Instant variables from main method or from diff class
		 * we must create object.
		 * 			Classname obj=new Classname();
		 * 			Datatype variable=obj.variablename;
		 * 
		 * 			//All variable return values.
		 */
		VariableTypes obj=new VariableTypes();
		int x=obj.b;
		System.out.println("Instant is => "+x);
		
		
		/*
		 * To Access Class Variables from diff class.
		 * 			Classname.Variablename;
		 */
		int y=VariableTypes.c;
		System.out.println("class variable is => "+c);
	}
	
	
	
}
