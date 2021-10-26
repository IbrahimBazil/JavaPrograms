package programs;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int fct = 1;
		for (int i=1;i<=n;i++) {
			fct=fct*i;
		}
		
		System.out.println(fct);
	}

}
