package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
		
		List L=new ArrayList();
		
		//add
		L.add("Red");
		L.add("Blue");
		L.add(1);
		L.add(null);
		L.add("R");
		System.out.println(L);
	    
	   //get
	   System.out.println(L.get(0));
	   
	   //set
	   L.set(3,123);
	   System.out.println(L);
	
	   //indexOf
	   System.out.println(L.indexOf("Blue"));
	   
	   //lastIndexOf
	   System.out.println(L.lastIndexOf("R"));
	   
	   //remove
	   L.remove(2);
	   System.out.println(L);
	   L.remove("R");
	   System.out.println(L);
	   
	   //contains
	   System.out.println(L.contains("Pink"));
	   
	   //isEmpty
	   System.out.println(L.isEmpty());
	   
	   //size
	   System.out.println(L.size());
		
	 
	}

}
