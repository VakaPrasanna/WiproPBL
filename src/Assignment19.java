
public class Assignment19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, num = 1;
		
		while(count < 5) {
			if(num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
				System.out.print(num + " ");
				count++;
			}
			num++;
		}
	}

}
