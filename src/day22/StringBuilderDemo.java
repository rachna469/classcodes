package day22;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String s1="Good";
		System.out.println(s1);
		s1.concat("Morning");
		System.out.println(s1);
		
		String r="";
		for(int i=s1.length()-1;i>=0;i--) {
			r=r+s1.charAt(i);
		}
		System.out.println(r);
		
		System.out.println("======");
		StringBuilder sb=new StringBuilder("Good");
		System.out.println(sb);
		sb.append(" Morning");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.delete(0, 7);
		System.out.println(sb);
		sb.insert(0, "Hello");
	}

}
