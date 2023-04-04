package Inheritance;

public class SingleInheritance {  //main class
	public static void main(String[] args) {
		SIChild child=new SIChild(); //create a object of child class
		//by using object we can use parent class method
		child.display();
		child.show();
	}

}

class SIParent{ //parent class
	void show() {   //parent class user defined method
		System.out.println("Show the details of parent class");
	}
}
class SIChild extends SIParent{  //child class
	void display() {
		System.out.println("Display the result of child class");
	}
}