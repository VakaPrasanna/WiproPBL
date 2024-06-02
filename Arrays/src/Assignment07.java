import java.util.Arrays;

public class Assignment07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12, 34, 12, 45, 67, 89};
		
		Arrays.sort(array);								
		int[] temp = new int[array.length];
		int j = 0;									
		for (int i = 0; i < array.length-1; i++){
			if (array[i] != array[i+1]){
				temp[j++] = array[i];  
			}
		}
		temp[j++] = array[array.length-1];
		for (int i = 0; i < j; i++){
			System.out.print(temp[i]+" ");  		
		}
	}
	
}