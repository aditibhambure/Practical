package Inheritance;

public class Parents_Simple { //Parent class
	int marks=85;
}
class Simple_Eg extends Parents_Simple {
	int Additional_percentage=5;
	public static void main(String[] args) {
		Simple_Eg obj=new Simple_Eg();
		System.out.println("Total marks:"+(obj.marks+obj.Additional_percentage));
	}
}
