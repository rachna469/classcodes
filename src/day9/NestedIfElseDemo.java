package day9;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		int a=4;
		int b=2;
		int c=3;
		
		if (a>b) {
			if (a>c) {
				System.out.println("a is the largest one.");
			}else {
				System.out.println("c is the largest one.");
			}
		} else {
			System.out.println("b is greater than a but c may be smaller or greater than a.");
		}
	}

}
