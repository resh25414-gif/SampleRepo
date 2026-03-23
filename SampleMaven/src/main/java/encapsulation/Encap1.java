package encapsulation;

public class Encap1 {
	
private int age;
private String name;
	public void getter()
	{
		System.out.println(name);
		System.out.println(age);
	}
	
	public void setter(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
}



