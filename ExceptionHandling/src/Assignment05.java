
import java.util.Scanner;

public class Assignment05 {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st integer number: ");
		int num1 = scan.nextInt();
		System.out.print("Enter 2nd integer number: ");
		int result = 0;
		int num2 = scan.nextInt();
		try {
			result = num1/num2;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Division is " + result);
	}

}

