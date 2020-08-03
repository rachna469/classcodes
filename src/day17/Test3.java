package day17;

public class Test3 {

	public static void main(String[] args) {
		Derived obj = new Derived();
		obj.sayHi();
		System.out.println(obj.getClass());

		System.out.println();
		System.out.println("=======");

		// implicit type casting(Up casting)
		Base parent = new Base();
		parent.sayHi();

		// explicit type casting(Down casting)
		Base base = new Base();
		Derived d1 = (Derived) base;
	}

}
