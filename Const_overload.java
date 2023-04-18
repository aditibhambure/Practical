package default_package;

public class Const_overload {
int age;
String name;
String address;
 Const_overload(int a,String n) {
	 age=a;
	 name=n;
			}
 Const_overload(int a,String n,String ad) {
	 age=a;
	 name=n;
	 address=ad;
 }
 public void show() {
	 System.out.println("Name="+name+"Age="+age+"Address="+address);
 }
public static void main(String[] args) {
	Const_overload ob=new Const_overload(25,"Aditi");
	Const_overload ob2=new Const_overload(23,"Sina","Solapur");
	ob.show();
	ob2.show();
}
}