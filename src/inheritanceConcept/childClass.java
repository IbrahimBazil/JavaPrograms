package inheritanceConcept;

public class childClass extends baseDemo {

	public void multiplication() {
		c=a*b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childClass c=new childClass();
		c.addition();
		c.subtaction();
		c.multiplication();
		
	}

}
