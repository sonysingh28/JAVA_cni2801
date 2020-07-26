package List;

import java.util.*;
public class HashTable 
{

	public static void main(String[] args) 
	{
	    
		Hashtable ht = new Hashtable();
		
		ht.put(1, "so");
		ht.put(2, "sro");
		ht.put(3, "so");
		
		System.out.println(ht);
		
		//Cloning of a hashmap
		
		Hashtable h2 = new Hashtable();
		
		h2 = (Hashtable)ht.clone();
		
		h2.put(5, "kj");
		
		System.out.println(h2);
		
		if(h2.containsValue("to"))
			System.out.println("Value exists!!");
		
		
		//Enumeration Concepts-print all the values - elements()
		
		Enumeration e = h2.elements();
		
		System.out.println("Values stored are::");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//print values using entry set()
		
		System.out.println("Vlaues using entryset are:");
		
		Set s = ht.entrySet();
		
		System.out.println(s);
		
		if(ht.equals(h2))
			System.out.println("Both are equal");
		
		//get the value from a key
		System.out.println(ht.get(2));
		
		//get the hashcode of hashtable object
		System.out.println(ht.hashCode());
		System.out.println(h2.hashCode());

		

	}

}
