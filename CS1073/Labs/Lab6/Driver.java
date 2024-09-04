import java.util.Arrays;
/**
This class is a test driver for IntArrayUtil class
@author Daniyal Khan 3765942
*/

public class Driver{
	public static void main(String[] args){
		System.out.println("Examples for max value:");
		int[] arr1 = {13, 10, 21, 20, 18, 11, 16};
		System.out.println("Array: " + Arrays.toString(arr1));
		System.out.println("Max Value: " + IntArrayUtil.max(arr1));
		int[] arr12 = {1001, 200, 1003, 101, 1200, 1400};
		System.out.println("Array: " + Arrays.toString(arr12));
		System.out.println("Max Value: " + IntArrayUtil.max(arr12));
		System.out.println();

		System.out.println("Examples for merged array:");
		int[] arr21 = {3, -4, 6, 9};
		int[] arr22 = {16, 11, 18, 20 ,21, 10, 13};
		System.out.println("Array1: " + Arrays.toString(arr21));
		System.out.println("Array2: " + Arrays.toString(arr22));
		System.out.println("Merged Array: " + Arrays.toString(IntArrayUtil.join(arr21, arr22)));
		int[] arr28 = {3, 2};
		int[] arr29 = {12, -1, 4, 6};
		System.out.println("Array1: " + Arrays.toString(arr28));
		System.out.println("Array2: " + Arrays.toString(arr29));
		System.out.println("Merged Array: " + Arrays.toString(IntArrayUtil.join(arr28, arr29)));
		System.out.println();

		System.out.println("Examples for reversing array:");
		int[] arr41 = {16, 11, 18, 20 ,21, 10, 13};
		System.out.println("Array: " + Arrays.toString(arr41));
		System.out.println("Reversed Array: " + Arrays.toString(IntArrayUtil.reverse(arr41)));
		int[] arr42 = {2, 41, 12, 42};
		System.out.println("Array: " + Arrays.toString(arr42));
		System.out.println("Reversed Array: " + Arrays.toString(IntArrayUtil.reverse(arr42)));
		System.out.println();


		System.out.println("Examples for alternating sum:");
		int[] arr51 = {13, 10, 21, 20, 18, 11, 16};
		System.out.println("Array: " + Arrays.toString(arr51));
		System.out.println("Alternating sum: " + IntArrayUtil.alternatingSum(arr51));
		int[] arr52 = {10, 11, 12, 14};
		System.out.println("Array: " + Arrays.toString(arr52));
		System.out.println("Alternating sum: " + IntArrayUtil.alternatingSum(arr52));
		System.out.println();
	}
}
