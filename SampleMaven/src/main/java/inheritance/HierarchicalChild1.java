package inheritance;

public class HierarchicalChild1 extends HierarchicalParent {
	public void print()
	{
		System.out.println("Child 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChild1 obj=new HierarchicalChild1();
		obj.display();
		obj.print();
	}

}
