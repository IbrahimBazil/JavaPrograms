package interfaceConcepts;

public class child implements base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c=new child();
		c.color();
		c.design();
	}

	@Override
	public void design() {
		// TODO Auto-generated method stub
	System.out.println("Designed for Tshirt");	
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
	System.out.println("Give the Color as Red");	
	}

}
