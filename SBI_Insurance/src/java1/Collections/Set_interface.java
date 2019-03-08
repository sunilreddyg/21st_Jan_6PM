package java1.Collections;

import java.util.HashSet;
import java.util.Set;

public class Set_interface 
{

	public static void main(String[] args) 
	{
		/*
		 * set is a unorder collection of objects. Where
		 * it doesn't support duplicate values to store.
		 */
		
		
		Set<String> set=new HashSet<String>();
		set.add("WD");
		set.add("IDE");
		set.add("GRID");
		set.add("WD");
		
		for (String eachtool : set) 
		{
			System.out.println(eachtool);
		}
		
		
		
	}

}
