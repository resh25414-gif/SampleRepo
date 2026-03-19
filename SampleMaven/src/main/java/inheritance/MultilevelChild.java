package inheritance;

public class MultilevelChild extends MultilevelParent {
	public void out()
	{
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		MultilevelChild obj=new MultilevelChild();
		obj.display();
		obj.print();
		obj.out();
	}

}
