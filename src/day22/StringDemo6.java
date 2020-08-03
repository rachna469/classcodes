package day22;

public class StringDemo6 {

	public static void main(String[] args) {

		String intro = "Hi,I am Santosh Lal Karna from Kathmandu Nepal. I am a Senior Java Developer, and also a Java Instructor.";

		String[] words = intro.split(",");
		for (String w : words) {
			System.out.println(w);
		}

	
	}

}
