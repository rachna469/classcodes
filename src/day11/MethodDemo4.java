package day11;

public class MethodDemo4 {
	
	public static int findMax(int a, int b) {
		int max=0;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		return max;
	}

	public static void main(String[] args) {
		int m= findMax(4,5);
		System.out.println("max num is:"+m);

	}

}
