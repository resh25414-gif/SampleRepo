package inheritance;

public class MultipleChild implements MultipleParent1, MultipleParent2{
	public void show()
	{
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		MultipleChild ob=new MultipleChild();
		ob.display();
		ob.print();
		ob.show();
	}

	@Override
	public void display() {
		
		System.out.println("parent1");
		
	}

	@Override
	public void print() {

System.out.println("Parent 2");
		
	}

}
