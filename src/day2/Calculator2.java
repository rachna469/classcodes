package day2;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of number 1:");
		int a = input.nextInt();
		System.out.println("Enter the value of number 2:");
		int b = input.nextInt();
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		System.out.println("The sum of " + a + " and " + b + " is: " + sum);
		System.out.println("The difference of " + a + " and " + b + " is:" + sub);
		System.out.println("The multiplication of " + a + " and " + b + " is:" + mul);
		System.out.println("The division of " + a + " and " + b + " is:"+div);
		input.close();
		
	}

}
 