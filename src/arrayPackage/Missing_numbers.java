package arrayPackage;

public class Missing_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[]= {1,2,4,6,7,9,10};
		int k=0;
		for(int i=0;i<n.length;i++) {
			
			int a=(i+1)*(i+2)/2;
			if(n[i]!=a){
				k=a;
			}
			System.out.println(k);
		}
		
		
	}

}
