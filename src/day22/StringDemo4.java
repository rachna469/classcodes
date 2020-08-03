package day22;

public class StringDemo4 {

	public static void main(String[] args) {
		String s1="Good Morning";
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(0, 5));
		System.out.println(s1.indexOf("d"));
		System.out.println(s1.contains("Morning"));
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.concat("Hello"));
		System.out.println("hello ".concat(s1));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		char[]ch=s1.toCharArray();
		System.out.println(ch[2]);
		
		System.out.println(s1.replace("Morning","Evening"));
		
		String s2=" Santosh Lal Karna ";
		System.out.println(s2.trim());
		
		if(s1.compareTo("Good Morning")==0) {
			System.out.println("both strings are equal.");
		}else
			System.out.println("Both strings are not equal");
	}

}
