
public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("The value of i: "+i);
		}
		int[] numbers = {10,20,30};
		/*for(int i=0; i< numbers.length; i++)
		{
			System.out.println("The value of index " + i + " is: " +numbers[i]);
		}*/
		for(int num:numbers){
			System.out.println("The value is: " +num);
		}
		
		String[] cars = {"ferrari","tesla","lexus"};
		for(String car:cars)
		{
			System.out.println(car);
		}
		
		
	}

}
