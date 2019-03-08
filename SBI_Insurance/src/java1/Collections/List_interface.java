package java1.Collections;

import java.util.ArrayList;
import java.util.List;

public class List_interface {

	public static void main(String[] args)
	{
		
		/*
		 * List:-->
		 * 			List store collection of objects inorder.
		 * 			And list allow duplicate values.
		 */
		
		
		List<String> list=new ArrayList<String>();
		list.add("IDE");
		list.add("RC");
		list.add("WD");
		list.add("GRID");
		list.add("RC");
		
		//Remove item from list
		list.remove("GRID");
		
		
		//get size of list
		int lsize=list.size();
		System.out.println("size of list => "+lsize);
				
		
		//Get Single item from list
		String toolname=list.get(2);
		System.out.println("2nd index tool name is => "+toolname);
		
		//Verify item available at collection list
		boolean flag=list.contains("GRID");
		System.out.println("item status is => "+flag);
		
		
		//Print all itema using for loop
		for (int i = 0; i < lsize; i++) 
		{
			String tname=list.get(i);
			System.out.println("=> "+tname);
		}
		
		

	}

}
