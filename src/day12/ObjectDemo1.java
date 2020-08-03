package day12;

public class ObjectDemo1 {

	public void greet() {
		System.out.println("Good morning USA...");
	}
	public static void main(String[] args) {
		ObjectDemo1 ob=new ObjectDemo1();//int a=5;
		//OR
		ObjectDemo1 ob1;//int a
		ob1=new ObjectDemo1();//a=5;

		new ObjectDemo1();//anonymous object
		new ObjectDemo1().greet();
	}

}
