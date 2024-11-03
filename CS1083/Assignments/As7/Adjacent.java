public class Adjacent {
    public static int t = 0;
    public static void main (String[] args) {
        long n = 955133366;
        System.out.println("1st Case:" + adjacentDigitCounter(n));
        long m = 112233;
        System.out.println("2nd Case: " + adjacentDigitCounter(m));
        long b = 0;
        System.out.println("3nd Case: " + adjacentDigitCounter(b));
        long v = 10;
        System.out.println("4nd Case: " + adjacentDigitCounter(v));
    }

    public static int adjacentDigitCounter(long n) {
        if (n <= 10) {
            return 0;
        }
        int count = (n % 10 == (n/10) % 10)? 1 : 0; // comparing last digit with the second last digit
        return count + adjacentDigitCounter(n/10); // chopping off the last digit
    }

    /*
        if (n % 10 == (n/10)%10) {
            return 1 + adjacentDigitCounter(n/10);
        } else {
            return 0 + adjacentDigitCounter(n/10);
        }
     */
}