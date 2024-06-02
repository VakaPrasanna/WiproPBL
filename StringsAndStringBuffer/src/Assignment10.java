import java.util.Scanner;

public class Assignment10 {

	static String lastRepeat(String str, int n) {
		String repStr = str.substring(str.length()-n);				//substring(beginIndex)
		String outStr = "";
		
		for(int i = 0; i  < n; i++) {
			outStr += repStr;
		}
		return outStr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		System.out.print("Enter the number: ");
		int n = scan.nextInt();
		
		System.out.println(lastRepeat(str, n));
	}

}