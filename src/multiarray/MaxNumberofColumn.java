package multiarray;

public class MaxNumberofColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{5,5,6},{3,7,9},{10,8,1}};
		int min=a[0][0];
		int max=a[0][0];
		int mincolumn=0;
		int k=0;
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
			if(a[i][j]<min) {
				mincolumn=j;
			}	
			}
		}
		while(k<3) {
			if(a[k][mincolumn]>max) {
				max=a[k][mincolumn];
			}
			k++;
		}
		System.out.println(max);
	}

}
