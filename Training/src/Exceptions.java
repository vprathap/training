import java.sql.SQLException;

public class Exceptions {
	public static void main (String[] args){
		Account Acc = new Account();
		try {
			Acc.withdraw(100);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Try again after sometime");
		}
	}

}
