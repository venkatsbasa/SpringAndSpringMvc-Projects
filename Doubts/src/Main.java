import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	public static void main(String...s) {
		List<String> c=new ArrayList<String>();
		System.out.println(c.size());
		for(String f:s) {
			System.out.print(f+"  ");
		}
		deleteMwtho();
	}
public static void deleteMwtho() {
	System.out.println("deleteMwtho");
}
}
