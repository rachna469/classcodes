package day6;

public class OperatorsDemo1 {

	public static void main(String[] args) {
		// Arithmetic Operator
		// +,-,*,/,%
		// precedence (priority)+ -(low), * / % (high)

		System.out.println(5 / 2);// 2 (Quotient)
		System.out.println(5 % 2);// 1 (Remainder- % is absolute)

		// Associativity: Left to right
		int a = 45 + 5 - 4 / 2 + 7 % 2;
		System.out.println(a);
	}

}
