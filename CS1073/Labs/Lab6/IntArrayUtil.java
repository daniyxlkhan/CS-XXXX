/**
This class performs operations on integer arrays.
@author Daniyal Khan 3765942
*/
public class IntArrayUtil{
	
	/**
	This method returns the maximum value in the array
	@param arr array of integer values
	@return the maximum value of the array
	*/	
	public static int max(int[] arr){
		int larger = arr[0];;
		
		for(int i = 0; i < arr.length - 1; i++ ) {
			if (larger < arr[i+1]) {
				larger = arr[i+1];
			}			
		}
		return larger;
	}
	
	
	/**
	This method combines one integer array after another 
	and returns that as a new array. 
	(The parameters themselves are not altered.) 
	@param arrA array of integer values
	@param arrB array of integer values
	@return a new array containing values from both parameters
	*/
	public static int[] join(int[] arrA, int[] arrB){
		int totalLength = arrA.length + arrB.length;
		int[] arr = new int[totalLength];
		
		for(int i = 0; i < arrA.length; i++) {
			arr[i] = arrA[i];
		}
		for(int i = arrA.length, j = 0; i < arr.length; i++, j++) {
			arr[i] = arrB[j];
		}
		return arr;
	}

	
	/**
	This method reverses the sequence of elements in an integer 
	array and returns that in a new array. 
	(The parameter itself is not altered.)
	@param arr array of integer values
	@return a new array with values reversed
	*/	
	public static int[] reverse(int[] arr){
		int[] reverseArr = new int[arr.length];

		for(int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			reverseArr[j] = arr[i];
		}
		return reverseArr;	
	}
	
	/**
	This method computes and returns the alternating sum 
	of all elements in the integer array that is 
	passed in via its parameter
	@param arr array of integer values
	@return the alternating sum
	*/	
	public static int alternatingSum(int[] arr){
		int altSum = 0;

		for(int i = 0; i < arr.length - 1; i=i+2) { //incrementing with 2 everytime
			altSum += arr[i] + (int) Math.pow(-1, i+1) * arr[i+1]; // adding the one value of array with the other value with negative pattern
		}
		if (arr.length % 2 == 1) { // if the length is odd
			altSum += arr[arr.length - 1]; // adding the last value that was missed because of incrementing by 2 in the loop
		}
		
		
		return altSum;
	}
	
}
