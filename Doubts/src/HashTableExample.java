import java.util.HashMap;

public class HashTableExample {
  int i=10;
  static int j;
	public static void main(String[] args) {
		/*HashMap<String, String> hs=new HashMap<String, String>();
		hs.put("hhh", "jjjgff");
		hs.put(null, "1");
		hs.put(null, "2");
		hs.put(null, "3");
		hs.put("null", "4");*/
		HashTableExample hh=new HashTableExample();
		System.out.println("======"+hh.i);
		System.out.println(j+"======"+hh.j);
		hh.m();
		Student s=new Student();
		   System.out.println(s.getClgname());
	}
   public void m() {
	   System.out.println(i);
	   System.out.println(j+"======");
   }
   
}
