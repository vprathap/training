import automobile.Cars;
import automobile.Tesla;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed = 0;
		Cars c1 = new Cars(speed);
		c1.increaseSpeed();
		
		Tesla tesla1 = new Tesla(speed);
		tesla1.increaseSpeed();
		tesla1.headupDisplayNavigation();
	}

}
