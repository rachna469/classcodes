package day7;

public class TypeCastinDemo4 {

	public static void main(String[] args) {
		//boolean b= true;
		//int i =b;
		
		//int a =5;
		//boolean bb=a;
		
		//No type casting of boolean
		
		char c1= 97;
		short s1= 97;
		System.out.println(c1);
		System.out.println(s1);
		
		char c2= 'a';
		short s2= 'a';
		System.out.println(c2);
		System.out.println(s2);
		
		char c3=65;
		short s3= (short)c3;
		System.out.println(c3);
		System.out.println(s3);
		
		short s4=66;
		char c4= (char)66;
		System.out.println(s4);
		System.out.println(c4);
		

	}

}
