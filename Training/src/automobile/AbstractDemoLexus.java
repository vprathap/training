package automobile;

public class AbstractDemoLexus extends AbstractCars {
		public void setPrivateSpeed(int speed)
		{
			super.setPrivateSpeed(10);
			
		}
		/*public void engineStart()
		{
			//super.engineStart();
			System.out.println("Lexus have keyless Engine start");
		}*/
		@Override
		public void engineStart(String Keytype, int numOfCyl) {
			// TODO Auto-generated method stub
			System.out.println("This is the Lexus Engine start");
			
		}
}
