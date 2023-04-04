package Inheritance;

public class MultilevelInheritance {
	public static void main(String[] args) {
		SIChild2 child=new SIChild2(); //create a object of class child 2
		child.display();
		child.show();
		child.print();
	}

}
class SIParent1 { //parent class
	void show() {  //parent class user defined method
		System.out.println("Show the details of the parent class");
	
	}
}
// child class of SIParent1 & parent class of SIChild2
	class SIChild1 extends SIParent1{
		void display() { //child class user defined method
			System.out.println("Display the result of the child class");
		}
	} class SIChild2 extends SIChild1 { //child class
		void print() { //child class user defined method
			System.out.println("Print the output of the child class 2");
		}
	}