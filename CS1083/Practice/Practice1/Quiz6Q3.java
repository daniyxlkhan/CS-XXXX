public class Quiz6Q3 {
    public static void main (String[] args) {
        System.out.println(func2(5));
    }
    public static int func2(int val) {
        if (val == 2) {
            return val;  // Base case
        } else {
            return val + func2(val - 1);  // Recursive case
        }
    }
}
