
public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int val1 = 10;
		//int val2 = 20;
		int score = 90;
		String grade;
		//boolean condition = val1 == val2;
		//System.out.println(condition);
		
		//if(val1<val2){
			//System.out.println("Yes, True");
		//}
		
		if (score>90){grade="A";}
		else if (score>80){grade="B";}
		else {grade="C";}
		System.out.println("Score is " + score);
		System.out.println("Grade is " + grade);
	}

}
