package abstraction;

public class ChildEthiad extends ParentClassAirctaft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildEthiad ch=new ChildEthiad();
		ch.safetyMesures();
		ch.planeBody();
		ch.planecolor();
	}

	@Override
	public void planecolor() {
		// TODO Auto-generated method stub
		System.out.println("Paint the Plane in Yellow color");
	}

}
