package automobile;
/***
 * Differentiate in data types of arguments
 * @author vspratha
 *
 */
public class CarOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increaseSeatHeight("2.00");
		increaseSeatHeight(1);
		increaseSeatHeight("nine");

	}
	public static void increaseSeatHeight(int heightToIncrease){
		System.out.println("Increased seat height by " + heightToIncrease + "inches" + "in Integer");
	}
	public static void increaseSeatHeight(float heightToIncrease){
		System.out.println("Increased seat height by " + heightToIncrease + "inches"+ "in Float");
	}
	public static void increaseSeatHeight(String heightToIncrease){
		System.out.println("Increased seat height by " + heightToIncrease + "inches" +"in String");
	}
}
