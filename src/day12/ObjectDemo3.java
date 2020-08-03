package day12;

public class ObjectDemo3 {

	public static void main(String[] args) {
		ObjectDemo3 ob1=new ObjectDemo3();//int a=5
		ObjectDemo3 ob2= ob1;//int b=a
		
		System.out.println("ob1 is:"+ob1);
		System.out.println("ob2 is:"+ob2);
		
		System.out.println("========");
		ob1=new ObjectDemo3();//a=6
		System.out.println("ob1 is:"+ob1);
		System.out.println("ob2 is:"+ob2);
	}

}
