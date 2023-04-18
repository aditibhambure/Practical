package default_package;

public class Param_const {
int age;
String name;
Param_const(int a, String n){
	age =a; 
	name=n;
}
void show() {
	System.out.println(age+" "+name); }
		public static void main(String[] args) {
			Param_const d= new Param_const(20, "ADITI");
			Param_const d1=new Param_const(20, "ROHIT");
			Param_const d2=new Param_const(20, "ALIA");
			d.show();
			d1.show();
			d2.show();
			
		}
	}

	