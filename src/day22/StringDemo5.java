package day22;

public class StringDemo5 {

	public static void main(String[] args) {
		String s1="Good";
		System.out.println(s1);
		s1.concat("Morning");
		System.out.println(s1);
		
		System.out.println("======");
		String s3="Good";
		System.out.println(s3);
		String s2=s1.concat("Morning");
		System.out.println(s2);
	}

}
