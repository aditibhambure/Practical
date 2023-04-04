package Inheritance;
//Multiple Inheritance is not supported through java class
public class MultipleIn {
	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.run();  //which run() method would be called? Parent1 Parent2
	}
}
class Parent1{ //parent class 1
	void run() { //parent class 1 user defined parent method
		System.out.println("Parent1 run method");
	}
}
class Parent2 {  //parent class 2
	void run() {  //parent class 2 user defined parent method
		System.out.println("Parent2 run method");
	}
}

class Child1 extends Parent1,Parent2{}  //compile time error