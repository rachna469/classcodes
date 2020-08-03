package day9;

public class ElseIfDemo {

	public static void main(String[] args) {
		
		int marks=25;
		if(marks<0||marks>=101) {
			System.out.println("Invalid marking system.");
			}
		else if (marks>=80 && marks<=100) {
			System.out.println("Distnction!!");
		}
		else if(marks>=70 && marks<=79) {
			System.out.println("First Division!!");
		} 
		else if (marks>=50 && marks<=69) {
			System.out.println("Second Division!!");
		} 
		else if (marks>=40 && marks<=49) {
		System.out.println("Third Division!!");
		}
		else {
			System.out.println("Fail!!");
		}
		System.out.println("more code...");
		System.out.println("exit....");
	}

}
