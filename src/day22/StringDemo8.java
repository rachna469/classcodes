package day22;

public class StringDemo8 {

	public static void main(String[] args) {
		System.out.println(isTrue("True"));
		System.out.println(isTrueOrYES("YES"));
		System.out.println(isEmail("rachana@gmail.com"));
		System.out.println(isNumberOnly("186"));
	}
	
	public static boolean isTrue(String s) {
		
		return s.matches("true||True");
	}
	
	public static boolean isTrueOrYES(String s) {
		return s.matches("True|TRUE|Yes|YES");
	}
	
	public static boolean isEmail(String s) {
		return s.matches("^(.+)@(.+)$");
	}
	
	public static boolean isNumberOnly(String s) {
		return s.matches("^\\d+$");
	}

}
