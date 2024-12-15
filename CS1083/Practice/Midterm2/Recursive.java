public class Recursive {
    public static void main (String[] args) {
        try {
            System.out.println("Exp: " + exp(2, 3));
            System.out.println("Factorial: " + factorial(5));
            System.out.println("Sum of digits: " + sumDigits(222));
            System.out.println("Sum of even numbers in value: " + sumEven(2187));
            System.out.println("Fibonnaci Sequence: " + fibonacci(5));
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            iae.printStackTrace();
        }
        
    }

    public static int exp (int base, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp == 1) {
            return base;
        } 
        return base * exp(base, exp-1);
    }

    public static int factorial (int n) {
        if (n == 0) {
            return 1;
        } 
        return n * factorial(n-1);
    }

    public static int sumDigits(int n) throws IllegalArgumentException{
        if (n < 0) {
            throw new IllegalArgumentException("Please give a positive integer");
        }
        if (n < 10) {
            return n;
        }
        return n % 10 + sumDigits(n/10);
    }

    public static int sumEven(int val) { // Week 9 Practice part b
        if (val == 0) {
            return 0;
        }
        if (val%2 == 0) {
            return val%10 + sumEven(val/10);
        } else {
            return sumEven(val/10);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}