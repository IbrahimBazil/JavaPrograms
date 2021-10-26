package multiarray;

public class reversalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 10, 5, 6 }, { 3, 7, 9 }, { 10, 8, 1 } };
		int min = a[0][0];

		for (int i = 2; i >=0; i--) {
			for (int j = 2; j >=0; j--) {
				
					//min = a[i][j];
					System.out.print(a[i][j]);
					System.out.print("\t");
			}
			System.out.println("");
		}
		
	}

}
