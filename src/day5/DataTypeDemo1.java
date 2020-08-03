package day5;

public class DataTypeDemo1 {

	public static void main(String[] args) {
		byte b1 = 127;// max range
		byte b2 = -128; // min range

		short s1 = 32767; // max range
		short s2 = -32768; // min range
		
		System.out.println("=======Integer=====");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		System.out.println("=======Long======");
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.SIZE);
		System.out.println(Long.BYTES);
		
		System.out.println("=======Float======");
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.SIZE);
		System.out.println(Float.BYTES);
		
		System.out.println("=======Double======");
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.SIZE);
		System.out.println(Double.BYTES);
		
		System.out.println("=======Character======");
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.SIZE);
		System.out.println(Character.BYTES);
		
		
		
	}

}
