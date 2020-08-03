package day23;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ExceptionDemo1 ob=new ExceptionDemo1();
		int div=ob.divide(input);
		System.out.println("Division is:"+div);
		input.close();

	}
	public int divide(Scanner input) {
		System.out.println("Please enter a:");
		int a=input.nextInt();
		System.out.println("Please enter b:");
		int b=input.nextInt();
		int div=a/b;
		return div;
	}

}
