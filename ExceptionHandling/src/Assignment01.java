import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		String stringNum = scan.nextLine();
		try {
			int intNum = Integer.parseInt(stringNum);
			System.out.println("The square is "+ intNum * intNum);
			System.out.println("The work has been done successfully");
		}
		catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
		}
	}
	
}
