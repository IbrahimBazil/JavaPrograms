import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class arrayList {
	@Test
	public void Test(){
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String> ();
		names.add("Abu");
		names.add("Bazil");
		names.add("Basariya");
		names.add("Hashim");
		names.add("Fathima");
		names.add("Gulam");
		names.add("Ansari");
		
		//instead of using for and If loops to get the count we can get by just using streams
		Long count=names.stream().filter(c->c.startsWith("H")).count();
		System.out.println(count);
		
		//Instead of Array we can directly form the Stream itself
		Stream.of("Abu","Bazil","Basariya").filter(s->{
			s.startsWith("B");
			return true;
		}).count();
		
		names.stream().filter(s->s.startsWith("B")).forEach(s->System.out.println(s));
		names.stream().filter(e->e.contains("i")).sorted().map(e->e.toUpperCase()).forEach(e->System.out.println(e));
	
	}

	//@Test
	public void concade() {
		List<String> names=Arrays.asList("Parrot","Cat","Dog","Peacock");
		List<String> names1=Arrays.asList("Lion","Tiger","Panther","Elephent");
		Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
		boolean flag=newStream.anyMatch(t->t.equalsIgnoreCase("coc"));
		System.out.println(flag);
		System.out.println(newStream.limit(4));
	}
	
}
