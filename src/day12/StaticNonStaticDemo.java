package day12;

public class StaticNonStaticDemo {
	String nonStaticVar="this is non-static variable.";
	static String staticVar="This is static variable..";
	//NON-STATIC METHOD
	public void sayHello() {
		System.out.println("Hello from Nepal....");
	}
	//STATIC METHOD
	public static void sayHi() {
		System.out.println("Hi from USA...");
	}

	public static void main(String[] args) {
		StaticNonStaticDemo ob=new StaticNonStaticDemo();
		ob.sayHello();
		System.out.println(ob.nonStaticVar);
		
		sayHi();
		StaticNonStaticDemo.sayHi();
		System.out.println(StaticNonStaticDemo.staticVar);
		
	}

}
