
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is the Intermountain Health Care Parkway office";
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "";
		String str5 = "   a   b   c   d   e  f  g   ";
		String str6 = "Hello";
		String str7 = "10000";
		
		System.out.println(str.length());
		System.out.println(str.charAt(9));
		System.out.println(str.concat(", Salt Lake City"));
		System.out.println(str.contains("Lake"));
		System.out.println(str.contains("Care"));
		System.out.println(str.startsWith("This"));
		System.out.println(str.startsWith("Apple"));
		System.out.println(str.endsWith("This"));
		System.out.println(str.endsWith("office"));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		int j = Integer.parseInt(str7.trim());
		System.out.println("The value of j " +j);
		
		System.out.println(str.indexOf('I'));
		System.out.println(str.isEmpty());
		System.out.println(str4.isEmpty());
		System.out.println(str5.trim());
		System.out.println(str6.replace('e', 'a'));
		System.out.println(str.substring(12));
		System.out.println(str.substring(5, 15));
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++)
				System.out.println("Index " + i + " is "  + charArray[i]);
		System.out.println("Lower case " + str.toLowerCase());
		System.out.println("Upper case " + str.toUpperCase());
	
	
	}

}
