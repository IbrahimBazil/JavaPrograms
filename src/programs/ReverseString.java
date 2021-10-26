package programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=78769;
		int a, r;
		int rev=0;
		a=n;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		
		System.out.println("Recerse "+rev);
		
		
	}

}
