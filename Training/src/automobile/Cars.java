package automobile;

public class Cars {

	int speedlimit = 100;
	//private variables only available in classes
//	private int  privateSpeed;
	protected int protectedSpeed;
	public Cars(){
		this(0);
	}
	public Cars(int startSpeed){
		
		speed = startSpeed;
		
	}
	public int speed;
	public int publicSpeed;
	public void increaseSpeed(){
		speed++;
		System.out.println("Increasing speed of Cars");
	}
	public void decreaseSpeed(){
		speed--;
		System.out.println("Deccreasing speed");
	}
	
}
