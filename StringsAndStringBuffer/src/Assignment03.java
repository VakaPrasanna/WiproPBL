import java.util.Scanner;
public class Assignment03 {

	static String copyString(String str) {
		String repStr = str.substring(0, 2);		
		String outStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			outStr += repStr;
		}
		return outStr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		System.out.println(copyString(str));
	}


}
