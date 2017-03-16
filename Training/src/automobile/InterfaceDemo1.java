package automobile;

public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarsInterface myInterface = new InterfaceDemo();
		myInterface.engineStart("Manual", true);
		Lexus myLexus = new InterfaceDemo();
		myLexus.headsUpNavigation();
		
	}

}
