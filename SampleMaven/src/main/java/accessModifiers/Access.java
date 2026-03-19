package accessModifiers;

public class Access {
	public void display1()
	{
		System.out.println("Public");
	}
	protected void display2()
	{
		System.out.println("Protected");
	}
	private void display3()
	{
		System.out.println("private");
	}
	void display4()
	{
		System.out.println("default");
	}
	public static void main(String[] args) {
	Access obj=new Access();
	obj.display1();
	obj.display2();
	obj.display3();
	obj.display4();
	}

}
