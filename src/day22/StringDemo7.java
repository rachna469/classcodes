package day22;

import java.util.StringTokenizer;

public class StringDemo7 {

	public static void main(String[] args) {
		String intro = "Hi,,I am Santosh Lal Karna from Kathmandu Nepal. I am a Senior Java Developer,, and also a Java Instructor.";
		
		String[]words=intro.split(",");
		System.out.println(words.length);
		for(String w:words) {
			System.out.println(w);
		}
		
		System.out.println("=========");
		StringTokenizer st = new StringTokenizer(intro,",");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
