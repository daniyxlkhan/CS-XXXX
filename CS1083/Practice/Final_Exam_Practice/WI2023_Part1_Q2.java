import java.util.Arrays;

public class WI2023_Part1_Q2 {
    public static void main (String args[]) {
        int array1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        printArray(array1);
        array1 = transpose(array1);
        System.out.println("Transpose: ");
        printArray(array1);
    }

    public static int[][] transpose(int[][] array) {
        int transArray[][] = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                transArray[j][i] = array[i][j];
            }
        }
        return transArray;
    }

    public static void printArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}