
public class StringReferenceDatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String literal - String constant pool
		String str1 = "Hello";
		
		
		//String object - Heap
		String str2 = new String("Welcome");
		
		String stradd = str1+" " +str2;
		System.out.println("The string add value is "+stradd);
		
	}

}
