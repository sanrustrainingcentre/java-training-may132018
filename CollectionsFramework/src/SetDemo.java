import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add(90);
		set.add(80);
		set.add(80);
		set.add(80);
		set.add(80);
		set.add(70);
		set.add(50);
		set.add(70);
		set.add(new Person("A", "B", 20));
		set.add(new Person("A", "B", 20));
		
		
		System.out.println(set);
		

	}

}
