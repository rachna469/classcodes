package day14;

//array is a collection of elements of same data type arranged in a sequential manner
public class ArrayDemo1 {

	public static void main(String[] args) {
		int a1, a2, a3, a4, a5;
		a1 = 23;
		a2 = 34;
		a3 = 45;
		a4 = 56;
		a5 = 12;
		int sum = a1 + a2 + a3 + a4 + a5;
		System.out.println(sum);

		// or

		int[] arr = new int[3];
		System.out.println(arr);
		System.out.println(arr.length);
		
		arr[0]=0;
		arr[1]=22;
		arr[2]=25;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	

	}

}
