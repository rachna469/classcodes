package day10;

import java.util.Scanner;

public class ForLoopDemo {
// instance variable
//int a;
	public static void main(String[] args) {
		//for(initialization;condition;update(increment/decrement)) {
		//This solution is usually for sum upto nth number.	
		Scanner input=new Scanner(System.in);
			System.out.println("Enter number:");
			int n=input.nextInt();
			
			//local variable has no default value. It must be initialized.
			int sum=0;
			for(int i=1;i<=n;i++) {
				sum=sum+i;
				System.out.println(i);
			}
			System.out.println("Sum is: "+sum);
			input.close();
	}

}
