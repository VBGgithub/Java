package day1;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Inside Main");
		new HelloWorld();
	}

	static {
		System.out.println("HelloWorld");
	}
	{
		System.out.println("Inside non static block");
	}
	HelloWorld()
	{
		System.out.println("Inside Constructor");
	}
}
