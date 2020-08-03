package day7;

public class TypeCastinDemo1 {

	public static void main(String[] args) {
		//Implicit casting (Up Cast)
		// By compiler
		byte b=127;
		int i= b;
		System.out.println("b is:"+b);
		System.out.println("i is: "+i);
		
		//Explicit Casting (Down cast)
		//By Programmer
		int ii=127;
		byte bb= (byte)ii;
		System.out.println("ii is: "+ii);
		System.out.println("bb is: "+bb);
		
		
	}

}
