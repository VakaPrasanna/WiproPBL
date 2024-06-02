import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 1st string: ");
		String str1 = scan.nextLine();
		System.out.print("Enter the 2nd string: ");
		String str2 = scan.nextLine();
		
		String outStr = "";
		
		while (str1.indexOf(str2) != -1) {	
			int index = str1.indexOf(str2);
			
			if (index == 0 && index + str2.length() < str1.length() - 1) {
				outStr += (str1.charAt(index + str2.length()));
				str1 = str1.replaceFirst(str2, "");
				continue;
			}
			
			if (index - 1 >= 0 && index + str2.length() >= str1.length()) {
				outStr += (str1.charAt(index - 1));
				str1 = str1.replaceFirst(str2, "");
				continue;
			}
			
			if (index + str2.length() < str1.length() - 1 && index - 1 >= 0) {
				outStr += (str1.charAt(index - 1));
				outStr += (str1.charAt(index + str2.length()));
				str1 = str1.replaceFirst(str2, "");
			}
		}

		System.out.println(outStr);
	}

}