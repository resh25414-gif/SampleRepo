package superKeyword;

public class SuperVariableChild extends SuperVariableParent{
	String colour="White";
	public void display()
	{
		System.out.println(colour);
	}

	public static void main(String[] args) {
		SuperVariableChild obj=new SuperVariableChild();
		obj.display();
		obj.print();

	}

}
