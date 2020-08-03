package day6;

public class OperatorsDemo3 {

	public static void main(String[] args) {
		//Increment/Decrement operator (++ --)
		//Post Increment (a++) or (a--)
		//Pre increment (++a) or (--a)
		
		int a=5;
		System.out.println(a);
		a+=1;
		System.out.println(a);
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);

		int x=4;
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);

		int b=2;
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);
		
		int m=5;
		int n=m++;
		System.out.println(m);
		System.out.println(n);
		
		int i= 5;
		i=(i++)+(++i)+i+1;
		System.out.println(i);
		
	}

}
