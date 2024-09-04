/**
@author Daniyal Khan 3765942
*/

public class NestLoop {
	public static void main(String[] args) {
		int[][] numbers = new int[3][7];
		int count = 1;
		int increment = 0;
		//assigning values to the array
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers[i].length; j++){
				numbers[i][j] = count + increment;
				increment += 3;
			}
			increment = 0;
			count++;
		}
		//printing the array
		//(do not make any changes to this code)
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers[i].length; j++){
				System.out.print(numbers[i][j] + " ");
			}
		System.out.println();
		}
	}	
}

