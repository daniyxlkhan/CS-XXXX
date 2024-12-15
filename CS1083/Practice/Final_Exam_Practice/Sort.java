import java.util.Arrays;

public class Sort {
    public static void main (String[] args) {
        int[] array = {5,3,4,1,2};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(array, 1,0, array.length-1));
    }

    public static void selectionSort(int[] array) {
        for (int outer = 0; outer < array.length; outer++) {
            int min = outer;
            for (int inner = min+1; inner < array.length; inner++) {
                if (array[min] > array[inner]) {
                    min = inner; 
                }
            }
            int temp = array[min];
            array[min] = array[outer];
            array[outer] = temp;
        }
    }

    public static int binarySearch(int[] array, int toFind, int min, int max) {
        if (min > max) {
            return -1;
        }
        int mid = (min+max)/2;
        if (array[mid] == toFind) {
            return array[mid];
        } else if (array[mid] > toFind) {
            return binarySearch(array, toFind, min, mid-1);
        } else {
            return binarySearch(array, toFind, mid+1, max);
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;
            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }

    }

    public static boolean binarySearch(int[] array, int search) {
        boolean success = false;
        int min = 0;
        int max = array.length-1;
        while (!success && min <= max) {
            int mid = (min+max)/2;
            if (array[mid] == search) {
                success = true;
            } else if (array[mid] > search) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return success;
    }
}
