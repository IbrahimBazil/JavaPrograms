package staticKeyword;

public class WithStaticKeyword {

	public static int count = 0; // will get memory only once and retain its value

	public static void counter2() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		counter2();
		counter2();
		counter2();
	}

}
