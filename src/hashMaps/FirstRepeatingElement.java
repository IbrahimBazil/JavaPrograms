package hashMaps;

import java.util.HashSet;

public class FirstRepeatingElement {

	
	public static int getFirstRepeatingElement(int array[]) {
		int minimumIndex=-1;
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=array.length-1;i>=0;i--) {
			if(set.contains(array[i])) {
				minimumIndex=i;
			} else {
				set.add(array[i]);
			}
		}
		return minimumIndex;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[]= {1,10,4,5,6,3,6,4,10};
		int min=getFirstRepeatingElement(a);
		if (min!=-1) {
			System.out.println("First repeating Element of Array is "+a[min]);
		} else {
			System.out.println("There are no repeating elements");
		}
		
	}

}
