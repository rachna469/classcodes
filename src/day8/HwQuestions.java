package day8;

import java.util.Scanner;

//No. 11 a)
public class HwQuestions {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a:");
		int a= input.nextInt();
		System.out.println("Enter b:");
		int b= input.nextInt();
		
		System.out.println("Before swapping a is :"+a);
		System.out.println("Before swapping b is :"+b);
		
		int temp =a;
		a=b;
		b=temp;
		
		System.out.println();
		System.out.println("After swapping a is:"+a);
		System.out.println("After swapping b is: "+b);
		input.close();
	}	

}
