package multiarray;

public class MinimumNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{10,5,6},{3,7,9},{10,8,1}};
		int min=a[0][0];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
				}
			}
		}
		System.out.println(min);
	}

}
