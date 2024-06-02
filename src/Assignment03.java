public class Assignment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("No values");
		}
		else {
			for(String name : args) {
				System.out.print(name + " ");
			}
		}
	}

}