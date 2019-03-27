package datadriver_Framework.NotepadFile;

import java.util.Scanner;

public class Read_Input_From_System_Console {

	public static void main(String[] args) 
	{
		
		//Create object for scanner
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your name:-->");
		String Username=sc.next();
		System.out.println("User account name is :--> "+Username);
		
		System.out.println("Enter your age;--> ");
		int UserAge=sc.nextInt();
		System.out.println("User Age is :--> "+UserAge);
		
		
		
		
		//Iteration Count
		System.out.println("Enter Start iteration--> ");
		int Start=sc.nextInt();
		System.out.println("Enter End iteration--> ");
		int End=sc.nextInt();
		
		for (int i = Start; i <= End; i++) 
		{
			System.out.println(i);
		}
		
		
		
		
		

	}

}
