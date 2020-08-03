package day17;

public class Derived extends Base {

	String name=" Child's name...";
	
	public void sayHi() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println("Hello from child...");
		super.sayHi();
	}
}

//super is always available in child class while this is available in its own class.
