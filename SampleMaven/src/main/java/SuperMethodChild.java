
public class SuperMethodChild extends SuperMethodParent {
	public void print()
	{
		System.out.println("Child method");
		super.display();
	}

	public static void main(String[] args) {
		
		SuperMethodChild obj=new SuperMethodChild();
		obj.print();
	}

}
