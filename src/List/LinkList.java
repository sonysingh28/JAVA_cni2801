package List;

import java.util.*;

public class LinkList {

	public static void main(String[] args) 
	
	{
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("SONY");
		l.add("MONY");
		l.add("TONY");

		for(String s:l)
		{
			System.out.println("Data's are:"+s);
			
		}

		
		Iterator t= l.iterator();
		
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		
	}

}
