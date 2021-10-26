package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

import programs.ReverseString;

public class streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> names=new ArrayList();
		names.add("Abu");
		names.add("Bazil");
		names.add("Basariya");
		names.add("Hashim");
		names.add("Bazil");
		long c=names.stream().filter(s->s.startsWith("B")).count();
		System.out.println(c);
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		ArrayList<String> users=(ArrayList<String>) names.stream().filter(s->s.length()>4).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(users);
		
		//ArrayList<String> users2=(ArrayList<String>) names.stream().collect(reversestre);
		
		//ArrayList<String>userss=(ArrayList<String>) names.stream().filter(s->s.compareToIgnoreCase(names)).collect(Collectors.toList());
		String repeat = null;
	HashSet<String> values=new HashSet<String>();
	String a[]= {"Bazil","Bazil","Hashim","Basariya"};
	for(int i=a.length-1;i>=0;i--) {
		if(values.contains(a[i])) {
			repeat=a[i];
		} else {
			values.add(a[i]);
		}
		
	}
	System.out.println(repeat);
	}
	

}
