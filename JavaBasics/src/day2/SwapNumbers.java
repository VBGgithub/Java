package day2;

public class SwapNumbers {
	public static void main(String[] args) {
		int a = 2, b = 3;
		swap(a, b);
		System.out.println("%d,%d "+a+b);
	}

	private static void swap(int a, int b) {
		System.out.println("a,b "+a+b);
		b=b+a;
		a=b-a;
		b=b-a;
		System.out.println("a,b "+a+b);
	}
}
