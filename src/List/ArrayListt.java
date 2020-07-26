package List;
import java.util.*;

public class ArrayListt 
{

	public static void main(String[] args) 
	
	{
		ArrayList ar = new ArrayList();
		
		ar.add(2);
		ar.add("SONY");
		ar.add(2);
		
		//System.out.println("Size of the array is :"+ar.size());
		
		int s= ar.size();
		
		//System.out.print("Values stored are:");
		/*for(int i=0;i<s;i++)
		{
			System.out.print(" "+ar.get(i));
		}*/
		
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(22);
		a1.add(34);
		a1.add(14);

		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		a2.add(22);
		a2.add(34);
		
		a1.addAll(a2);
		
		//a1.removeAll(a2);
		
		a1.retainAll(a2);
		
		//System.out.println(a1.size());
		System.out.print("Values stored are:");
		for(int i=0;i<a2.size();i++)
		{
			System.out.print(" "+a2.get(i));
		}


		/*Employee e1 = new Employee("Sony",12,"PD");
		Employee e2 = new Employee("Mony",11,"MD");
		Employee e3 = new Employee("Nony",10,"TD");
		
		ArrayList<Employee> ae = new ArrayList<Employee>();
		ae.add(e1);
		ae.add(e2);
		//ae.add(e3);
		
		Iterator<Employee> it = ae.iterator();
		
		while(it.hasNext())
		{
			Employee emp = it.next();
			System.out.print(" "+emp.name+" ");
			System.out.print(" "+emp.rn+" ");
			System.out.print(" "+emp.dept+" ");
			System.out.println(" ");


		}

      System.out.print("Size of the ArrayList is:"+ae.size()); */
      
      
	}

}
