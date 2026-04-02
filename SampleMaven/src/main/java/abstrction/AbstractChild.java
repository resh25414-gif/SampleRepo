package abstrction;

public class AbstractChild extends AbstractParent{

	public static void main(String[] args) {
		
		AbstractChild obj=new AbstractChild();
		obj.calculate();
		obj.display();
		obj.sum(10, 20);
	}

	@Override
	public void display() {
		System.out.println("Abstract method");
		
	}

	@Override
	public void calculate() {
		
		int a=10;
		int b=20;
		int result=a*b;
		System.out.println(result);
	}

}
