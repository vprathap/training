public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myIntArray1 = {100,90};
		
		/*myIntArray1= new int[10];
		
		myIntArray1[0]	= 3;
		myIntArray1[1] = 27;*/
		System.out.println("0 index " + myIntArray1[0]);
		System.out.println("1 index " + myIntArray1[1]);
		//System.out.println("2 index " + myIntArray1[2]);
		
		String[] myStringArray1 = {"lexus","ferrari","tesla"};
		System.out.println("0 index " + myStringArray1[0]);
		System.out.println("1 index " + myStringArray1[1]);
		System.out.println("2 index " + myStringArray1[2]);
		
		int len1 = myIntArray1.length;
		int len2 = myStringArray1.length;
		
		System.out.println("Int array length: " +len1 );
		System.out.println("String array length: " +len2 );
		for (int i=0; i < len1; i++)
		{ System.out.println(myIntArray1[i]);	}
		//Arrays.(myIntArray1[i]);
		//System.arraycopy(len2, len2, len2, len2, len2)
		int j =0;
		for(int i=0;i<39;i++)
		{
			boolean test = false;
			System.out.println("i"+i);
			test = i==j;
			if(test){
				
				j++;
				;}
				
		}
		

}}
