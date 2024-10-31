public class FloorPainting {
    public static void main (String[] args) {
        char[][] floor1 = {{'1', '0', '0', '0'}, {'0', '1', '0', '0'}, {'1', '1', 'G', '0'}, {'0', '1', '0', '0'}};
        char[][] floor2 = {{}};

        paintFloor(floor1, 2, 2, 'G');
    }

    public static void paintFloor(char[][] floor, int row, int col, char paint) {
        // row and col point to gray tiles
        System.out.println("Current Position = " + row + ", " + col);
        printArray(floor);
        System.out.println();
        // Down
        if (row + 1 < floor.length && floor[row+1][col] == '0') {
            floor[row+1][col] = paint;
            paintFloor(floor, row+1, col, paint); 
            // if we paint a tile we also want to paint all of its
            // adjacent tiles that's why we are calling it recursively 
        }
        // Up
        if (row - 1 >= 0 && floor[row-1][col] == '0') {
            floor[row-1][col] = paint;
            paintFloor(floor, row-1, col, paint);
        }
        // Right
        if (col + 1 < floor[0].length && floor[row][col+1] == '0') {
            floor[row][col+1] = paint;
            paintFloor(floor, row, col+1, paint);
        }
        // Left
        if (col - 1 >= 0 && floor[row][col-1] == '0') {
            floor[row][col-1] = paint;
            paintFloor(floor, row, col-1, paint);
        }   
    }

    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
