package overloadingConcepts;

public class DemoClass {

	// Over Loading- Multiple methods have same number but it can be differentciated
	// but passing different type or number of arguments

	public void getData(int a) {
		System.out.println("Overaloaded with int");
	}

	public void getData(String a) {
		System.out.println("Overloaded with string");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Test";
		int c = 10;
		DemoClass d=new DemoClass();
		d.getData(c);
		d.getData(test);

	}

}
