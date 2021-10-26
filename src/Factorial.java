
import java.util.ArrayList;
import java.util.List;

public class Factorial {
	public static void main(String args[]) {
		int n = 4;
		int res = facto(n);
		System.out.println("factorial: " + res);
//List<String> reqParams = new ArrayList<>(2);
//reqParams.add("ramya");
//reqParams.add("6578902");
//System.out.println(reqParams.get(1));
	}

	public static int facto(int n) {
		int val = 1;
		if (n > 0) {
			val = n * (facto(n - 1));
		}
		return val;
	}
}
