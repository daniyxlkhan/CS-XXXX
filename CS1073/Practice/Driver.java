import java.util.Arrays;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        int[][] array = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
        Random rand = new Random();
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total = 0;
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = rand.nextInt(10) + 1;
                total += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println("|" + total);
        }

        for (int i = 0; i < array[0].length; i++) {
            total = 0;
            for (int j = 0; j < array.length; j++) {
                total += array[j][i];
            }
            System.out.print(total + " ");
        }

        
        /** int[] array = {10, 2, 8, 12, 5};
        double[] array1 = {35.2, 90.2, 80.1, 56.2, 34.2};
        lowestGrade(array1);
        swap(array);
        int[] freq = digitFrequency(177081);
        System.out.println(Arrays.toString(freq));     **/
    }

    public static void swap(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length; i++) { 
            for (int j = i+1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp; 
                }
            } 
        }

        System.out.println(Arrays.toString(array));
    }

    public static void lowestGrade(double[] array) {
        int index = 0;
        double total= 0.0;
        int count = 0;
        double avg = 0.0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[index]) {
                index = i;
            }
        }
        array[index] = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                total += array[i];
                count++;
            } 
        }
        avg = (double)total/count;

        System.out.println(avg);
    }

    public static int[] digitFrequency(int number) {
        String strNum = "" + number;
        int[] array = new int[10];
        //System.out.println(array.length);

        for (int i = 0; i < strNum.length(); i++) {
            for (int j = 0; j < 10; j++) {   
                if (strNum.charAt(i) - '0' == j) {
                    array[j]++;
                }
            }
        }

        return array;
    }
}
