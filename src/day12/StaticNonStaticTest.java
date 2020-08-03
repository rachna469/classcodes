package day12;
//Note- to call static modifier, just use classname.method. To call non
//static modifier, create an object
public class StaticNonStaticTest {

	public static void main(String[] args) {
		StaticNonStaticDemo obj=new StaticNonStaticDemo();
		obj.sayHello();
		StaticNonStaticDemo.sayHi();
	}

}
