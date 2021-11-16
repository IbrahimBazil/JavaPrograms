package staticKeyword;

public class WithoutStaticKeyword {

	public static void counter() {
		int count = 0; // count is not declared as static--> So memory will be allocated everytime it
						// runs and values wont be retained
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		counter();
		counter();
		counter();

	}

}
