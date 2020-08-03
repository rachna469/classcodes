package day11;

public class MethodDemo1 {

	// Method declaration
	public void sayHello() {
		System.out.println("Hello from Nepal.");
	}
	public static void main(String[] args) {
		System.out.println("main start!!");
		//object creation
		MethodDemo1 ob = new MethodDemo1();
		//method calling
		ob.sayHello();
		System.out.println("main end!!!");
	}

}
