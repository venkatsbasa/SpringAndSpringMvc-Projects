
public class MethodsInJava {

	public static void main(String[] args) {
	Dog d=new Dog();
	d.setName("kukka");
	d.setColor("b&w");
	System.out.println(d.getColor()+" "+d.getName());
	foo(d);
	System.out.println(d.getColor()+" "+d.getName());
	}
 public static void foo(Dog someDog) {
	 someDog.setName("Max"); // AAA 
	 System.out.println(someDog.getName());
	 //someDog = new Dog("Fifi"); // BBB 
	 someDog.setName("Rowlf");
	 System.out.println(someDog.getName());
 }
	 
}
