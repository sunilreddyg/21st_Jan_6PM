package java1.Collections;

import java.util.Hashtable;
import java.util.Set;

public class HashTable_Interface {

	public static void main(String[] args) 
	{
		
		/*
		 *  Hash accept objects to store using key and value
		 */
		
		
		Hashtable<Integer, String> h = new Hashtable(); 
        h.put(1, "arjun");
        h.put(2, "varun");
        h.put(3, "kiran");
        		/*
        		 * => 1 is  Key
        		 * => arjun is a value
        		 */
        
        String t=h.get(1);
        System.out.println(t);
        
        String t1=h.get(2);
        System.out.println(t1);
        
       
        
       Set<Integer> keys= h.keySet();
       for (Integer integer : keys) 
       {
    	   System.out.println("key names => "+integer);
    	   System.out.println("key value => "+h.get(integer));
    	   System.out.println("\n");
	   }
		
       
       
       
       
       
       
       
	}
       
}
