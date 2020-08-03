package day21;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = "Nepal";
		String s2 = "Nepal";

		String s3 = new String("Nepal");
		String s4 = new String("Nepal");

		System.out.println(s1 == s2);// true
		System.out.println(s1 == s3);// false
		System.out.println(s3 == s4);// false
		
		System.out.println();
		
		System.out.println(s1.contentEquals(s2));// true
		System.out.println(s1.contentEquals(s3));// true
		System.out.println(s3.contentEquals(s4));// true

		System.out.println();

		String s5 = "nepal";
		System.out.println(s1.contentEquals(s5));//false
		System.out.println(s1.equalsIgnoreCase(s5));//true
	}

}
