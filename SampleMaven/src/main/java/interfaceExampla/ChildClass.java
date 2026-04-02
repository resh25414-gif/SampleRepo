package interfaceExampla;

public class ChildClass implements ParentInterface{

	public void print()
	{
		System.out.println("Child Interface");
	}
	public static void main(String[] args) {
		
		ChildClass obj=new ChildClass();
		/* obj.display();
		obj.print();
		obj.sum(); */
//reference creation
		ParentInterface ref=new ChildClass();
		ref.display();
		ref.sum();
	}
	@Override
	public void display() {

	System.out.println("Parent Interface");	
	}
	@Override
	public void sum() {
	int a=10;
	int b=10;
	int add=a+b;
	System.out.println("sum="+add);
		
	}

}
