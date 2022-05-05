package day1;

public class ObjectAndString {
public static void main(String[] args) {
	long l=10000;
	System.out.println(l);
	Long ln=Long.valueOf(l);
	System.out.println(ln);
	
	//obj to String
	String str= ln.toString();
	System.out.println(str);
	
	//String to obj
	Long l2=Long.valueOf(str);
	System.out.println(l2);
	
	
}
}
