package java.regularmethods;

public class SmartPhone 
{

	public void touch()
	{
		System.out.println("touch");
	}
	
	public void camera()
	{
		System.out.println("camera");
	}
	
	
	public  void calculator()
	{
		System.out.println("calculator");
	}

	
	
	public static void main(String args[])
	{
		  //create object for class
		 SmartPhone obj=new SmartPhone();
		 obj.touch();
		 obj.camera();
		 obj.calculator();
	}

}
