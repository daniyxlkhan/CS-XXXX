public class p1 {
    public static void main (String args[]) {
        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Sum upper: " + sumUpper(array));
    }

    public static int sumUpper(int[][] mat) {
        int sumUpp = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat[i].length; j++) {
                sumUpp += mat[i][j];
            }
        }
        return sumUpp;
    }
}