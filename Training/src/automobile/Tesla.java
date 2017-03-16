package automobile;
public class Tesla extends Cars {

	public Tesla(int startSpeed){
		super(startSpeed);
	}

	@Override
	public void increaseSpeed() {
		// TODO Auto-generated method stub
		//super.increaseSpeed();
		//protectedSpeed++;
		System.out.println("Increasing speed of Tesla");
	}
	public void headupDisplayNavigation(){
		System.out.println("Tesla specific functionality");
	}
	/*public void increaseSpeed(int speed){
		
	}*/
	
}
