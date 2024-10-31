public class SumDigits {
    public static void main(String[] args) {
        int sum = SumDigits(222);
        System.out.println(sum);
    }

    public static int SumDigits(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Negetive Numbers are not allowed");
        } else if(n < 10) {
            return n;
        }
        return n%10 + SumDigits(n/10);
    }
}

