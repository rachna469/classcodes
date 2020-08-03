package day12;

public class Employee {

	String empName;
	int empId;
	
	public Employee() {
		System.out.println("default contractor.....");

	}
	public Employee(String name) {
		empName=name;
		System.out.println("argumented constructor....");
	}
	public Employee(int id) {
		empId=id;
		System.out.println("arg constructor...");
		
	}
	public Employee(String name, int id) {
		empName=name;
		empId=id;
		System.out.println("Arg constructor...");
	}

	public Employee(int id,String name) {
		empName=name;
		empId=id;
		System.out.println("Arg constructor...");
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee(11,"Ram");
	}
}
