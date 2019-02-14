package other_package;

import java.StaticMethods.InputDevices;
import java.regularmethods.SmartPhone;

public class Calling_Methods_From_Diff_package {

	public static void main(String[] args)
	{
		
		/*
		 * Note:-->
		 * 		Before calling methods or variables
		 * 		from diff package we must import referrals first.
		 */
		
		SmartPhone obj=new SmartPhone();
		obj.calculator();
		obj.camera();
		obj.touch();
		
		//Static methods from diff packages
		InputDevices.keyboard();
		InputDevices.mouse();

	}

}
