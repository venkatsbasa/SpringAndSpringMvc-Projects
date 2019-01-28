
public class TestMain {

	public static void main(String[] args) {

System.out.println("parent==="+Class.class);
m1();
	}
public static void m1() {
	System.out.println("am m1 metod");
}
}
class c extends TestMain{
	public static void main(String[] args) {

		System.out.println("cccc==="+Class.class);}
		
}