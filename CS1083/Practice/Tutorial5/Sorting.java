import java.util.Arrays;

public class Sorting {
    public static void main(String args[]) {
        int[] array = {5, 7, 1, 8, 2, 4, 3};
        SelectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void SelectionSort(int[] array) {
        // Practice for selection sort
        for (int outer = 0; outer < array.length - 1; outer++) {
            int min = outer;
            for (int inner = outer+1; inner < array.length; inner++) {
                if (array[min] > array[inner]) {
                    min = inner;
                }
            }
            int temp = array[min];
            array[min] = array[outer];
            array[outer] = temp;
        }
    }

    public static void InsertionSort(int[] array) {
        
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            
            while (j >=0 && array[j] > temp) {
                array[j+1] = array [j];
                j--;
            }

            array[j+1] = temp;
        }
    }

    /*public void insertionSort(T[] list){
		for(int i = 1; i < list.length; i++){
			T temp = list[i];
			int j = i - 1;
			
			while(j >= 0 && list[j].compareTo(temp) > 0){
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = temp;
		}
	} */
}