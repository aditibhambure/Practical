package Inheritance;
//Hierarchical class
public class Operating_System {  //parent class A
	void Boost() {
		System.out.println("Boosting mode on");
	}
}
 class Windows extends Operating_System { //child class 1
	 void run() {
		 System.out.println("Run mode on");
	 }
 }
 class Linux extends Operating_System{ //child class 2
	 void storage_capacity() {
		 System.out.println("Storage capacity is very high");
	 }
 }
 public class HierarchicalIn {
	 public static void main(String[] args) {
		 Linux b=new Linux();
		 b.Boost();
		 b.storage_capacity();
		 Windows c=new Windows();
		 c.run();
		 c.Boost();
	 }
 }