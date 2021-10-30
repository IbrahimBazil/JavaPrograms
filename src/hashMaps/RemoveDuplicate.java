package hashMaps;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Bazil");
		map.put(2, "Basariya");
		map.put(3, "Hashim");
		map.put(4, "Gulam");

		System.out.println("Iterating Hashmap: ");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		map.replace(3, "Hashim", "Mohammed Hashim");
		map.remove(4);
		map.put(5, "Fathima");
		System.out.println("After Changing the Process: ");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
