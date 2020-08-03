package day15;

import java.util.Scanner;

public class ArrayMethodDemo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String []ar=returnArray(input);
		
//System.out.println(Arrays.toString(ar));
		printArray(ar);
	}
	public static String[]returnArray(Scanner input){
		System.out.println("enter the size of an array:");
		int size=input.nextInt();
		String []arr=new String[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element:");
			arr[i]=input.next();
		}
		return arr;
	}

	public static void printArray(String[]arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
