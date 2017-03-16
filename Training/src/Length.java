import java.util.Scanner;

public class Length {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			@SuppressWarnings("resource")
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter the String for which you need to find the length : ");
		    //For string
			String text= scan.nextLine();
		    System.out.println(text);
		    int z = stringlength(text);
		    System.out.println("The length of String is " + z);
		}
		
		public static int stringlength(String test)
		{
			int a = test.length();
			return a;
		}
	}

	


