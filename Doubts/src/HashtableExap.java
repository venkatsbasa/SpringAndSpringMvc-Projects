import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableExap {

	public static void main(String[] args) {
		//HashMap<Temp,String> h=new HashMap<>();
		Hashtable<Temp,String> h=new Hashtable<>();
		h.put(new Temp(6),"ana");
		h.put(new Temp(25),"ab");
		h.put(new Temp(2),"ad");
		h.put(new Temp(5),"ef");
		h.put(new Temp(50),"efj");
		//h.put(null,"erf");
		System.out.println(h);
		 /*Map map = new HashMap();
		  map.put(1, "sam");
		  map.put(1, "Ian");
		  map.put(1, "Scott");
		  map.put(null, "asdf");
		  System.out.println(map);*/
	}

}
