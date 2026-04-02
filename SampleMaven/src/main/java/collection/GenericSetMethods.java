package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		
		Set <String> s= new HashSet <String> ();
		
		//add method add elements
		s.add("Red");
		s.add("White");
		s.add("Black");
		
		//addAll method used to add/merge two list
		Set <String> s1= new HashSet <String>();
		s1.add("Pink");
		s1.add("Purple");
		s.addAll(s1); //add all elements of s1 to s
		System.out.println(s);
		
		//contains
		System.out.println(s.contains("Pink"));
		
		//containsAll checks all the elemets in one set contains in another set
		System.out.println(s1.containsAll(s));
		
		//isEmpty
		System.out.println(s.isEmpty());
		
		//remove only with element only
		s.remove("Black");
		System.out.println(s);
		
		//removeAll used to remove all the elements from one set
		s.removeAll(s1);
		System.out.println(s);
		
		//size
		System.out.println(s.size());
		System.out.println(s1.size());

		//clear used to delete all elements but structure remains
		s.clear();
		System.out.println(s);

	}

}
