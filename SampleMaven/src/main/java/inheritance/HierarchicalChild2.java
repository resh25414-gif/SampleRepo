package inheritance;

public class HierarchicalChild2 extends HierarchicalParent{
public void out()
{
	System.out.println("Child 2");
}
	public static void main(String[] args) {
		
		HierarchicalChild2 ob=new HierarchicalChild2();
		ob.out();
		ob.display();

	}

}
