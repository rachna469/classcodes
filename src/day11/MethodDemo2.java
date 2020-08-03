package day11;

import java.util.Scanner;

public class MethodDemo2 {
	
	public void printInfo(String name, int age) {
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
	}

	public static void main(String[] args) {
		MethodDemo2 obj=new MethodDemo2();
		
		//obj.printInfo("Rachana",23);
		
		Scanner reader=new Scanner (System.in);
		System.out.println("Enter name:");
		String n=reader.next();
		System.out.println("Enter age:");
		int a= reader.nextInt();
		obj.printInfo(n, a);
		reader.close();
	}

}
