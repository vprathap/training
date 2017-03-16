public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		
		c1.setMake("Tesla");
		System.out.println(c1.getMake());
		System.out.println(c1.gear);
		System.out.println(c1.speed);
		Car c2 = new Car(3,4);
		c2.setMake("Ferrari");
		System.out.println(c2.getMake());
		System.out.println(c2.gear);
		System.out.println(c2.speed);
	}

}
