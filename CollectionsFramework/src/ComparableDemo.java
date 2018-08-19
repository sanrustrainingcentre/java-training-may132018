import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(new Person("A20", "BA", 30));
		arrayList.add(new Person("A3", "AHF", 50));
		arrayList.add(new Person("A4", "XY", 20));
		arrayList.add(new Person("A1", "PQ", 25));
		arrayList.add(new Person("A3", "TS", 18));
		arrayList.add(new Person("A2", "FG", 55));
		
//		arrayList.add("Z");
//		arrayList.add("P");
//		arrayList.add("A");
//		arrayList.add("Y");
		
		boolean isAsc = false;
		
		System.out.println("===============================");
		System.out.println("Sorting by firstname name (Descending order)");
		Collections.sort(arrayList, new FirstNameComparator(isAsc));
		System.out.println(arrayList);
		
		isAsc = true;
		System.out.println("===============================");
		System.out.println("Sorting by last name (Ascending order)");
		Collections.sort(arrayList, new LastNameComparator(isAsc));
		System.out.println(arrayList);
		
		isAsc = false;
		System.out.println("===============================");
		System.out.println("Sorting by last name (Descending order)");
		Collections.sort(arrayList, new AgeComparator(isAsc));
		System.out.println(arrayList);
		
		
		int[] values = {21, 20, 30 ,-1, -10};
		Arrays.sort(values);
		
		List listOfObjects = Arrays.asList(values);
		Object[] array = listOfObjects.toArray();

	}

}
