package day13;
//variable inside the method is local variable
public class ThisDemo1 {

	//instance variable
	int a=5;
	
	public void display() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		ThisDemo1 ob1=new ThisDemo1();
		System.out.println("ob1 is:"+ob1);
		ob1.display();
		
	}

}
