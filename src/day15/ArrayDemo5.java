package day15;

import java.util.Scanner;

public class ArrayDemo5 {

	public static void main(String[] args) {
		final int ROW=2;
		final int COLUMN=2;
		int [][]arr= new int [ROW][COLUMN];
		
		Scanner input=new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("Enter:");
				arr[i][j]=input.nextInt();				
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
input.close();
	}

}
