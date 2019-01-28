
public class Test {

	public static void main(String...args) {
	 int i;
		if(args.length>0) {
			i=1;
		}
		//new Test().sum(98,98,76);
		m1(0);

	}
	public static void m1(int...a) {
		System.out.println("var agr method");
	}
	public static void m1(int a) {
		System.out.println("normal method");
	}
      public void sum(int...a) {
    	  int tot=0;
    	  for(int x:a) {
    		  tot+=x;
    	  }
    	  System.out.println(tot);
      }
}
