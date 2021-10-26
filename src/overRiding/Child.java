package overRiding;

public class Child extends overRidingBase{

	
	// over riding the same method with new values
	public void audioSystem() {
		System.out.println("Audio Sysytem is Designed for new car");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.engine();
		c.color();
		c.audioSystem();
		
	}

}
