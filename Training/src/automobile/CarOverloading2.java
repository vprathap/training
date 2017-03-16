package automobile;
/***
 * Sequence of data type of arguments
 * @author vspratha
 *
 */

public class CarOverloading2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increaseSeatHeight(9, "Lexus");
		increaseSeatHeight("Height", 3);
	}
	public static  void increaseSeatHeight(String var1, int var2){
		System.out.println("String and int");
	}
	public static  void increaseSeatHeight(int var1, String var2){
		System.out.println("int and Sting");
	}
}
