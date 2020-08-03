package day7;

public class OperatorDemo5 {

	public static void main(String[] args) {
		// Logical Operator
		
		// &&(and), ||(or), !(Not)
				System.out.println("====&&===");
				System.out.println(true && true); // true
				System.out.println(true && false);// false
				System.out.println(false && true);// false
				System.out.println(false && false);// false
				
				System.out.println("====||===");
				System.out.println(true || true);// true
				System.out.println(true || false);// true
				System.out.println(false || true);// true
				System.out.println(false || false);// false

				System.out.println("====!===");
				System.out.println(!true);// false
				System.out.println(!false); // true

	}

}
