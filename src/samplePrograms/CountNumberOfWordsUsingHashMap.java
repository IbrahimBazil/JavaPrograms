package samplePrograms;

import java.util.HashMap;

public class CountNumberOfWordsUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String statement = "This Code is Done By Ibrahim Bazil is to attend the Interview";
		String[] split = statement.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count + 1);
			} else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
	}
}
