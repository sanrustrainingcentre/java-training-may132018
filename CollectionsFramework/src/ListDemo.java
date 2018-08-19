import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		List arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add("ABC");
		arrayList.add('A');
		arrayList.add(false);
		
		arrayList.remove(false);
		arrayList.set(0,  20);
		
		System.out.println("is A character present in array list = " + arrayList.contains('A'));
		
		System.out.println(arrayList.size());
		
		System.out.println(arrayList);
		Iterator iterator = arrayList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
