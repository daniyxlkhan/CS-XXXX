public class PracticeQ1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        changeArray(array);
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i%2 == 0) {
                array[i] += 2;
            } else {
                array[i] /= 2;
            }
        }
    }
}