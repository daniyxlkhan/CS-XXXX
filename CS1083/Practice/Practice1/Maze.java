public class Maze {
    public static void main(String[] args) {
        int[][] maze = {{1, 1, 1, 1}, {0, 1, 0, 1}, {1, 1, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}};

        findPath(maze, 0, 0);
    }

    public static boolean findPath(int[][] maze, int row, int col) {
        System.out.println("Current Position = " + row + ", " + col);
        printArray(maze);
        System.out.println();
        if(row == maze.length-1 && col == maze[0].length-1) { // if last row and last column we are successful
            maze[row][col] = 9; // if the path leads to the end
            System.out.println("Current Position = " + row + ", " + col);
            printArray(maze);
            System.out.println();
            return true;
        } else {
            maze[row][col] = 3; // if it doesnt lead to the end
            boolean path = false;
            // Go down case
            // checking if there is row below us and if the postion below us is a 1
            if (row + 1 < maze.length && maze[row+1][col] == 1) { 
                path = findPath(maze, row+1, col);
            }
            // Go up
            // checking if there is row above us and if the postion above is a 1
            if (row - 1 >= 0 && maze[row-1][col] == 1) {
                path = path || findPath(maze, row-1, col); // if PATH is true we dont need to call findPath again thats why we have the OR||
            }// Go right
            if (col + 1 < maze[0].length && maze[row][col+1] == 1) {
                path = path || findPath(maze, row, col+1);
            }
            // Go left
            if (col - 1 >= 0 && maze[row][col-1] == 1) {
                path = path || findPath(maze, row, col-1);
            }

            if (path) {
                maze[row][col] = 9;
            }
            System.out.println("Current Position = " + row + ", " + col);
            printArray(maze);
            System.out.println();
            return path;
        }   
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    
}
