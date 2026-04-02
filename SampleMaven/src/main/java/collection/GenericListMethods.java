package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
	
		List <String> s= new ArrayList <String> (); //generic method using list interface
		
		//add method is used to add elements into a list
		
		s.add("Apple");
		s.add("Orange");
		s.add("Grapes");
		s.add("Banana");
		s.add("Pineapple");
		s.add("Orange");
		System.out.println(s);
		
		//get method used to get a particular element in list
		
		System.out.println(s.get(4));
		
		//set method used to set a new value at given index
		
		s.set(2, "avacado");
		System.out.println(s);
		
		//indexOf method used to find the first occurance of an element
		
		System.out.println(s.indexOf("Apple"));
		System.out.println(s.indexOf("Orange"));
		
		//lastIndexOf used to find last occurance of an element
		
		System.out.println(s.lastIndexOf("Orange"));
		System.out.println(s.lastIndexOf("Pineapple"));
		
		//remove method used to remove element in specified index
		//remove element by both index and value
		//by value the first elemet that see with the value only eliminates
		
		s.remove(2);
		System.out.println(s);
		s.remove("Orange");
		System.out.println(s);
		
		//contains method used to check whether a given element is present or not, result is boolean
		
		System.out.println(s.contains("Banana"));
		
		//isEmpty used to check the list is empty or not
		
		System.out.println(s.isEmpty());
		
		//size method used to find size of list
		
		System.out.println(s);
		System.out.println(s.size());
	}

}
