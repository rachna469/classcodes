package day15;

public class ArrayDemo6 {

	public static void main(String[] args) {
		int [][]arr= {{2,4,4},{1,2,4},{6,9,0}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
