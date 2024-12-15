/**
 * Recursively sums the even digits in a non-negative integer.
 * For example, the sum of the even digits in the number 2781 is 10.
 * @param val A non-negative integer.
 * @return The result of summing the even digits.
 */
public class sumEven {
    public static void main (String[] args) {
        // System.out.println(sumEven(222));
        String s = "hello";
        s = s.substring(0, 1);
        System.out.println(s);
    }
    
    public static int sumEven(int val) {
        if (val == 0) {
            return 0;
        }
        if (val % 2 == 0) {
            return val%10 + sumEven(val/10);
        } else {
            return sumEven(val/10);
        }
    }
    
}
