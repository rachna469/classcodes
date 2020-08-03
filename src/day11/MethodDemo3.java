package day11;

import java.util.Scanner;

public class MethodDemo3 {
	
	public static int sum() {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a:");
		int a=input.nextInt();
		System.out.println("Enter b:");
		int b=input.nextInt();
		int sum=a+b;
		return sum;
		//input.close();
		//Why is this giving error??
	}

	public static void main(String[] args) {
		MethodDemo3 ob= new MethodDemo3();
		ob.sum();
		
	}

}
