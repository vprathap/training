
public class ClassDemo {
	
	static String str2 = "Hi there....!";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello Java";
		
		System.out.println(str2);
		
		System.out.println(str1);
			
	for(int i =0; i<args.length; i++)
	{
			System.out.println(args[i]);
	}
		
		System.out.println("****************");
		CarClass c1 = new CarClass();
		//CarClass c2 = new CarClass();
		c1.year = 2016;
		c1.model = "Tesla";
		
		System.out.println(c1.year);
		System.out.println(c1.getYear());
		}
	}

class CarClass {
	
	int year = 2000;
	String model;
	public int getYear(){
		return this.year;
	}
	
}