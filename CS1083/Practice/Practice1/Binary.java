public class Binary {
    public static void main (String[] args) {
        int array[] = {1, 3, 5, 7, 9};
        System.out.println(BinarySearch(array, 1,0, array.length-1));
    }

    public static boolean BinarySearch(int array[], int n, int min, int max) {
        int mid = (min+max)/2;
        if (min > max) {
            return false;
        } else if (n == array[mid]) {
            return true;
        } else if (n > array[mid]) {
            return BinarySearch(array, n, mid+1, max);
        } else {
            return BinarySearch(array, n, min, mid-1);
        }  
    }
}
