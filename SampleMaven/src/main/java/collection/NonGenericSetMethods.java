package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
		Set s=new HashSet();
		Set s1=new HashSet();
		
		//add
		s.add("Dog");
		s.add("Cat");
		s.add(1);
		
		s1.add("R");
		s1.add(345);
		
		//addAll
		s.addAll(s1);
		System.out.println(s);
		
		//contains
		System.out.println(s.contains("Dog"));
		
		//containsAll
		System.out.println(s.containsAll(s1));
		System.out.println(s1.containsAll(s));
		
		//isEmpty
		System.out.println(s.isEmpty());
		
		//remove
		s.remove("Cat");
		System.out.println(s);
		
		//removeAll
		s.removeAll(s1);
		System.out.println(s);
		
		//size
		System.out.println(s.size());
		
		//clear
		s.clear();
		System.out.println(s);
		
		

	}

}
