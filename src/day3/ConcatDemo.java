package day3;
//If appending with string, it is called concatenation
public class ConcatDemo {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		String name = "Ram Thapa";
		String greet = "Hello, ";
		System.out.println("Hello,");
		System.out.println("Hello, " + name);
		System.out.println((greet + name));
		System.out.println(a + b);
		System.out.println(a + " " + b);
		System.out.println(a + greet + name + b);
		System.out.println(a + " " + greet + " " + name + " " + b);
		System.out.println("Sum is:" + a + b);
		System.out.println("Sum is:" + (a + b));
		System.out.println("Sum of " + a + " and " + b + " is:" + (a + b));

	}

}
