package day12;
//Question: When is it good to use anonymous object??
public class ObjectDemo2 {

	public static void main(String[] args) {
		ObjectDemo2 ob=new ObjectDemo2();//int a=5;
		System.out.println(ob);
		
		ObjectDemo2 ob1;
		ob1=new ObjectDemo2();
		System.out.println(ob1);

		System.out.println(new ObjectDemo2());//anonymous object
		
	}

}
