package collection;

import java.util.ArrayList;
import java.util.List;

public class ForEachList {

	public static void main(String[] args) {
		List <String> l= new ArrayList <String> ();
		
		l.add("Amal");
		l.add("Reshma");
		l.add("Zyair");
		
		for(String s: l)
		{
			System.out.println(s);
		}
		
		
}
}
