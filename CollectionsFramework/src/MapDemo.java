import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Person> map = new LinkedHashMap();
		map.put("KEY1", "VALUE1");
		map.put("KEY2", "VALUE2");
		map.put("KEY3", "VALUE3");
		map.put("KEY4", "VALUE4");
		map.put("KEY5", "VALUE5");
		map.put("KEY6", "VALUE6");
		map.put("P001", new Person("A", "B", 19));
		map.put("P002", new Person("C", "D", 20));
		
		
		map.remove("KEY1");
		
		System.out.println(map);
		
		String person1Id = "P001";
		Person value1 = (Person) map.get(person1Id);
		System.out.println(value1);
		
		String person2Id = "P002";
		Person value2 = (Person) map.get(person2Id);
		System.out.println(value2);
//		System.out.println(value.getFirstName() + " " + value.getLastName() + " is " + value.getAge() + " years old.");

	}

}
