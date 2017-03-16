package automobile;

public class InterfaceDemo implements CarsInterface,Lexus {

	@Override
	public void engineStart(String engineType, boolean isKeyLess) {
		// TODO Auto-generated method stub
		System.out.println("This is the implementation");
	}

	@Override
	public void headsUpNavigation() {
		// TODO Auto-generated method stub
		System.out.println("This is headupsNavigation");
	}
	

}
