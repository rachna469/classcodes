package day9;

import java.util.Scanner;

public class SwitchCaseDemo3 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your choice:");
		String choice= input.next();
		switch (choice) {
		
		case "add":
			System.out.println("This is addition.");
			break;
		case "sub":
			System.out.println("This is subtraction.");
			break;
		case "mul":
			System.out.println("This is multiplication.");
			break;
		case "div":
			System.out.println("This is division.");
			break;
		default:
			System.out.println("Wrong choice!!");
		
		}
		input.close();
		System.out.println("More code....");
		System.out.println("Exit....");
	}

}
