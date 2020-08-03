package day12;

public class Student {
//Do not initialize here at all
	String name;
	int roll;

	/*public void assignInfo(String n, int r) {
		name = n;
		roll = r;
	}
*/
	public void assignInfor(String name, int roll) {
		this.name=name;
		this.roll=roll;
	}
 
	public void printInfo() {
		System.out.println("Student name is:" + name);
		System.out.println("Student roll is:" + roll);
	}

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.assignInfor("Rachana", 20);
		student1.printInfo();
		
		System.out.println("========");
		Student student2 = new Student();
		student2.assignInfor("Barsha", 2);
		student2.printInfo();
		
	}

}
