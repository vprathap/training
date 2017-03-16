package automobile;

public class CarOverloading {

	public static void main(String[] args) {
		//Number of parameters could be different
		//Data types of parameters are different
		//Sequence of data type is different
		increaseSeatHeight(2);
		increaseSeatHeight(9,true);
	}
		public static void increaseSeatHeight(int heightToIncrease){
			System.out.println("Increased seat height by " + heightToIncrease + "inches");
		}
		public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight){
			System.out.println("Increased seat height by " + heightToIncrease + "inches");
			if(rememberHeight){
				System.out.println("Your selection is saved");
			} else {
				System.out.println("Your selection is not saved");
			}
		}

	

}
