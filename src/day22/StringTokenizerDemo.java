package day22;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String intro = "Hi,I am Santosh Lal Karna from Kathmandu Nepal. I am a Senior Java Developer, and also a Java Instructor.";
		
		StringTokenizer st = new StringTokenizer(intro);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("*********");
		st= new StringTokenizer(intro,",");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		

}
}
