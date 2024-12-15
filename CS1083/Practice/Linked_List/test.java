public class test {
    public static void main(String[] args) {
        System.out.println(methodA(2, 2, 4, 3));
    }

    public static int methodA(int a, int b, int c, int d) {
        if (a == c && b == d) {
            return 2;
        } else if (a > c || b > d) {
            return 0;
        } else {
            int sum = methodA(a + 1, b, c, d);
             sum += methodA(a, b + 1, c, d);
            return sum;
        }
    }
}
