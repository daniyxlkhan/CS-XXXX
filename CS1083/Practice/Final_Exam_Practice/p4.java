import java.io.*;
import java.util.Scanner;

public class p4 {
    public static void main (String[] args) {
        int[][] map = facilityMap();
        System.out.println("Map:");
        printArray(map);
    
        System.out.println("Area: " + calcArea(map));
        System.out.println("After traversal");
        printArray(map);
    }

    public static int calcArea(int[][] map) {
        for (int i = 0; i < map[0].length; i++) {
            if (map[0][i] == 0) {
                traverse(map, 0, i);
            }
        }
        int count = 0;
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 3) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void traverse (int[][] map, int row, int column) {
        // down
        if (row + 1 < map.length && map[row+1][column] == 0) {
            map[row+1][column] = 3;
            traverse(map, row+1, column);
        }
        // up
        if (row - 1 >= 0 && map[row-1][column] == 0) {
            map[row-1][column] = 3;
            traverse(map, row-1, column);
        }
        // right
        if (column + 1 < map[0].length && map[row][column+1] == 0) {
            map[row][column+1] = 3;
            traverse(map, row, column+1);
        }
        // left
        if (column - 1 >= 0 && map[row][column-1] == 0) {
            map[row][column-1] = 3;
            traverse(map, row, column-1);
        }
    }

    public static int[][] facilityMap() {
        try {
            Scanner scan = new Scanner(new File("facility.in"));
            int rows = scan.nextInt();
            int columns = scan.nextInt();
            scan.nextLine();
            int[][] map = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                String line = scan.nextLine();
                String[] chars = line.split(" ");
                for (int j = 0; j < columns; j++) {
                    map[i][j] = Integer.parseInt(chars[j]);
                }
            }
            return map;
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
        return null;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
