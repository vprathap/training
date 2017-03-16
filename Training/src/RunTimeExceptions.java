
public class RunTimeExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int c;
		try{
		c = a/b;
		
		System.out.println("The Result is " +c);
		
	}
	catch(ArithmeticException e){
		System.out.println(e.getMessage());
		
	}

}}
