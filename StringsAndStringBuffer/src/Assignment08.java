import java.util.Scanner;

public class Assignment08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		String[] stars = str.split(".[\\*]+.");
		
		StringBuffer sb = new StringBuffer();
		
		for (String x : stars)
			sb.append(x);
		
		System.out.println(sb);
	}

}