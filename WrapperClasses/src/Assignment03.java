import java.util.Scanner;

public class Assignment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the integer number (1 to 255) :");
		int intNum = scan.nextInt();
		
		String output = String.format("%8s", Integer.toBinaryString(intNum)).replace(' ', '0');
		System.out.println(output);	
	}

}
