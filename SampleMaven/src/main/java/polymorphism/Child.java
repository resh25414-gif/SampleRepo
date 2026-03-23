package polymorphism;

public class Child extends Parent{
	public void display(String s)
	{
		System.out.println("Child class");
		System.out.println(s);
	}
public static void main(String args[])
{
	Child obj= new Child();
	obj.display("Java");
}
}
