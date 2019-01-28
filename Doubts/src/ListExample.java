import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(12);
		l.add(22);
		l.add(72);
		l.add(82);
		l.add(13);
		l.add(10);
		l.add(18);
		l.add(13);
		l.add(17);
		System.out.println(l+" size==="+l.size());
		// by using list iterator we can add or remove
		ListIterator<Integer> i=l.listIterator();
		while(i.hasNext()) {
			Integer j=i.next();
			if(j==22) {
				i.add(32);
			}
		}
		System.out.println();
		System.out.println(l+" size==="+l.size());
		// normal way its not allowed to add java.util.ConcurrentModificationException
		/*for(int i:l) {
			if(i==22) {
				l.add(2,44);
			}
			System.out.print(i+" ");
		}
*/
		
		for(int k=0;k<l.size();k++) {
			int j=l.get(k);
			if(j==22) {
				l.remove(4);
			}
			
		}
		System.out.println(l+ "size==="+l.size());
	}

}
