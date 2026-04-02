package exceptionHandling;

public class Exceptions {

	public static void main(String[] args) {
	
		int a=10;
		int b=0;
		try
		{
			int c=a/b;
			System.out.println(c);	
		}
		catch(ArithmeticException z)
		{
			b=2;
			int c=a/b;
			System.out.println(c);
			System.out.println(z);
		}
		finally
		{
			System.out.println("Finally");
		}

	}

}
