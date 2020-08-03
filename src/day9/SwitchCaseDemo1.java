package day9;

import java.util.Scanner;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		/*
		switch(expression) {
		
		}
		case 1:
			break;
		case 2:
			break;
		default:
		*/
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your choice:");
		int choice= input.nextInt();
		switch (choice) {
		
		case 1:
			System.out.println("This is addition.");
			break;
		case 2:
			System.out.println("This is subtraction.");
			break;
		case 3:
			System.out.println("This is multiplication.");
			break;
		case 4:
			System.out.println("This is division.");
			break;
		default:
			System.out.println("Wrong choice!!");
		
		}
		System.out.println("More code....");
		System.out.println("Exit....");
		input.close();
	}

}
