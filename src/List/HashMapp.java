package List;

import java.util.*;
import java.util.Map.Entry;

public class HashMapp 
{

	public static void main(String[] args)
	{
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
 		
		hm.put(1,"SONY");
		hm.put(2,"MONY");
		hm.put(3,"MONY");

		System.out.println(hm.get(1));
		System.out.println(hm.get(3));
		
		for (Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+" , "+m.getValue());
		}

		hm.remove(2);
		
		System.out.println(hm);
		
		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee("Tom",25, "IT");
		Employee e2 = new Employee("Peter",27, "QA");
		Employee e3 = new Employee("Tomyy",28, "PD");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		
		for(Entry<Integer,Employee> m :  emp.entrySet())
		{
			int key = m.getKey();
			Employee e = m.getValue();
			
			System.out.println(key +"Info");
			
			System.out.println(e.name+" "+e.rn+" ,"+e.dept);
			
		}
		
		
	/*	for (Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+" , "+m.getValue());
		} */

		
	}

}
